import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int min = 500;
            PriorityQueue<Sport> sports = new PriorityQueue<>();
            ArrayList<Sport> temp = new ArrayList<>();
            for (int i = 0; i < m; i++) temp.add(new Sport());

            for (int i = 0; i < n; i++) {
                int[] rank = new int[m];
                for (int j = 0; j < m; j++) {
                    int cur = in.nextInt() - 1; // ranking
                    rank[j] = cur;
                }
                People person = new People(rank);
                temp.get(rank[0]).l.add(person);
            }
            for (Sport s : temp) sports.add(s); // now all sorted by popularity
            while (!sports.isEmpty()) {
                Sport cur = sports.poll();
                cur.live = false;
                min = Math.min(min, cur.l.size());
                // System.out.println(cur.l.size());
                if (sports.size() == 1) break;
                for (People p : cur.l) {
                    while (!temp.get(p.rank[p.cur]).live) {
                        p.cur++;
                    }
                    temp.get(p.rank[p.cur]).l.add(p);
                }

                sports = new PriorityQueue<>();
                for (Sport s : temp) if (s.live) sports.offer(s);
            }
            out.println(min);
        }

        public class People {
            int[] rank;
            int cur = 0;

            public People(int[] a) {
                rank = a;
            }

        }

        public class Sport implements Comparable<Sport> {
            List<People> l = new ArrayList<>();
            boolean live = true;

            public int compareTo(Sport s) {
                return (s.l.size() - this.l.size());
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

