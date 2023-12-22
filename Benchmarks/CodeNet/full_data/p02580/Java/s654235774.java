import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lucasr
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EBomber solver = new EBomber();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBomber {
        public void solve(int testNumber, MyScanner sc, PrintWriter out) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int M = sc.nextInt();
            Map<Integer, Integer> r = new HashMap<>(), c = new HashMap<>();
            Set<Long> points = new HashSet<>();
            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                inc(a, r);
                inc(b, c);
                points.add(encode(a, b));
            }
            int maxR = r.values().stream().mapToInt(i -> i).max().getAsInt();
            int maxC = c.values().stream().mapToInt(i -> i).max().getAsInt();
            int ans = maxC + maxR - 1;

            clean(r, maxR);
            clean(c, maxC);
            int[] newR = r.keySet().stream().mapToInt(i -> i).toArray();
            int[] newC = c.keySet().stream().mapToInt(i -> i).toArray();
            for (int rr : newR) {
                for (int cc : newC) {
                    if (!points.contains(encode(rr, cc))) {
                        ans++;
                        out.println(ans);
                        return;
                    }
                }
            }
            out.println(ans);
        }

        static long encode(long a, long b) {
            return (a << 20) | b;
        }

        static void inc(int k, Map<Integer, Integer> counter) {
            counter.put(k, counter.getOrDefault(k, 0) + 1);
        }

        static void clean(Map<Integer, Integer> map, int value) {
            map.entrySet().removeIf(next -> next.getValue() != value);
        }

    }

    static class MyScanner {
        private BufferedReader br;
        private StringTokenizer tokenizer;

        public MyScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(br.readLine());
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

