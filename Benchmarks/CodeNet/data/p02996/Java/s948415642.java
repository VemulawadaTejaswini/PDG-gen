import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Megalomania solver = new Megalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class Megalomania {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            PriorityQueue<Pair> pq = new PriorityQueue<>(n, (o1, o2) -> Long.compare(o1.time, o2.time));
            for (int i = 0; i < n; i++) {
                Long task = Long.parseLong(in.next());
                Long time = Long.parseLong(in.next());
                pq.add(new Pair(task, time));
            }

            long time = 0;
            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                time += p.task;
                if (time > p.time) {
                    out.append("No");
                    return;
                }
            }
            out.append("Yes");
        }

        class Pair {
            public final Long task;
            public final Long time;

            public Pair(Long task, Long time) {
                this.task = task;
                this.time = time;
            }

        }

    }
}

