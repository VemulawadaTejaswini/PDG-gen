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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int W = in.nextInt();
            List<Pair> list = new ArrayList<>();
            for (int i = 0; i < N; i++)
            {
                list.add(new Pair(in.nextInt(), in.nextInt()));
            }
            out.print(sol(W, 0, list));
        }

        private long sol(int W, long w, List<Pair> list)
        {
            if (list.isEmpty()) return 0;
            long maxValue = 0;
            for (int i = 0; i < list.size(); i++)
            {
                Pair p = list.remove(i);
                if (w + p.w <= W)
                {
                    List<Pair> l = new ArrayList<>(list);
                    maxValue = Math.max(maxValue, p.v + sol(W, w + p.w, l));
                }
                list.add(i, p);
            }
            return maxValue;
        }

    }

    static class Pair
    {
        long w;
        long v;

        Pair(long w, long v)
        {
            this.w = w;
            this.v = v;
        }

    }
}

