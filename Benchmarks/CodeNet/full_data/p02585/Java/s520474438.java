import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int K = in.nextInt();
            int P[] = CPUtils.readIntArray(N, in);
            int nums[] = CPUtils.readIntArray(N, in);
            long ans = Long.MIN_VALUE;
            for (int idx = 0; idx < N; idx++)
            {
                boolean visited[] = new boolean[N];
                List<Long> seq = new ArrayList<>();
                fillSeq(P[idx] - 1, 0, P, nums, seq, visited);
                //System.out.println(seq);

                if (K <= seq.size() || seq.get(seq.size() - 1) < 0)
                {
                    for (int i = 0; i < Math.min(K, seq.size()); i++)
                    {
                        ans = Math.max(ans, seq.get(i));
                    }
                } else
                { // K >= seq.length && seq is positive
                    long localAns;
                    long times = (K / seq.size() - 1);
                    localAns = times * seq.get(seq.size() - 1);
                    ans = Math.max(ans, localAns);

                    int j = P[idx] - 1;
                    for (long k = (times * seq.size()) + 1; k <= K; k++)
                    {
                        localAns += nums[j];
                        ans = Math.max(ans, localAns);
                        j = P[j] - 1;
                    }
                    //System.out.println(localAns);
                }
            }
            out.println(ans);
        }

        private void fillSeq(int idx, long sum, int[] P, int[] nums, List<Long> seq, boolean[] visited)
        {
            if (visited[idx]) return;
            visited[idx] = true;
            sum += nums[idx];
            seq.add(sum);
            fillSeq(P[idx] - 1, sum, P, nums, seq, visited);
        }

    }

    static class CPUtils
    {
        public static int[] readIntArray(int size, Scanner in)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextInt();
            }
            return array;
        }

    }
}

