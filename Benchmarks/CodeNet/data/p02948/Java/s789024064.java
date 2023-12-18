import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int N = in.nextInt();
            int M = in.nextInt();
            ArrayList<Integer>[] l = new ArrayList[M];
            for (int i = 0; i < M; i++) {
                l[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < N; i++) {
                int A = in.nextInt();
                int B = in.nextInt();
                if (M - A >= 0) {
                    l[M - A].add(B);
                }
            }
            int ans = 0;
            PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
            for (int i = M - 1; i >= 0; i--) {
                for (int b : l[i]) {
                    q.add(b);
                }
                if (!q.isEmpty()) {
                    ans += q.poll();
                }
            }
            out.println(ans);

        }

    }
}

