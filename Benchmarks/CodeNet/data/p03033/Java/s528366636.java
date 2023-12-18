import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            ArrayList<node> a = new ArrayList<node>();
            ArrayList<Long> ans = new ArrayList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            TreeSet<Integer> ts = new TreeSet<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                double s = in.nextInt();
                double t = in.nextInt();
                int x = in.nextInt();
                a.add(new node(s - x - 0.5, 0, x));
                a.add(new node(t - x - 0.5, 1, x));
            }
            Collections.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    if (Double.compare(o1.time, o2.time) != 0) {
                        return Double.compare(o1.time, o2.time);
                    } else if (o1.start != o2.start) {
                        return Double.compare(o1.start, o2.start);
                    } else {
                        return o1.x - o2.x;
                    }
                }
            });

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).start == 0) {
                    if (map.containsKey(a.get(i).x)) {
                        map.put(a.get(i).x, map.get(a.get(i).x) + 1);
                    } else {
                        ts.add(a.get(i).x);
                        map.put(a.get(i).x, 1);
                    }
                } else {
                    if (map.get(a.get(i).x) == 1) {
                        map.remove(a.get(i).x);
                        ts.remove(a.get(i).x);
                    } else {
                        map.put(a.get(i).x, map.get(a.get(i).x) - 1);
                    }
                }
                if (ts.size() > 0)
                    ans.add((long) ts.first());
                else {
                    ans.add(-1L);
                }
            }
//        for(int i=0;i<2*n;i++){
//            out.println(ans.get(i));
//        }
            for (int i = 0; i < q; i++) {
                int x = in.nextInt();
                int l = 0;
                int r = 2 * n - 1;
                while (l < r) {
                    int mid = (int) Math.ceil(((double) (l + r) / 2));
                    if (Double.compare(a.get(mid).time, x) > 0) {
                        r = mid - 1;
                    } else {
                        l = mid;
                    }
                }
                out.println(ans.get(l));
            }

        }

        class node {
            double time;
            int start;
            int x;

            node(double time, int start, int x) {
                this.time = time;
                this.start = start;
                this.x = x;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

