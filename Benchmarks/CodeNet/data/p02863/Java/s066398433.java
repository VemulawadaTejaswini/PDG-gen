import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
        EAllYouCanEat solver = new EAllYouCanEat();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAllYouCanEat {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int T = in.nextInt() - 1;
            int K[][] = new int[n + 1][T + 1];
            int del[] = new int[n];
            int ti[] = new int[n];
            ArrayList<node> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(new node(in.nextInt(), in.nextInt()));
            }
            Collections.sort(arr, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    if (o1.time != o2.time)
                        return o1.time - o2.time;
                    else return o2.del - o1.del;
                }
            });
            for (int i = 0; i < n; i++) {

                ti[i] = arr.get(i).time;
                del[i] = arr.get(i).del;
            }
            for (int i = 0; i <= n; i++) {
                for (int w = 0; w <= T; w++) {
                    if (i == 0 || w == 0)
                        K[i][w] = 0;
                    else if (ti[i - 1] <= w) {
                        K[i][w] = Math.max(del[i - 1] + K[i - 1][w - ti[i - 1]], K[i - 1][w]);
                    } else
                        K[i][w] = K[i - 1][w];
                }
            }
            int max = 0;
            int res = K[n][T - 1];
            int w = T;
            HashSet<Integer> hs = new HashSet<>();
            for (int i = n; i > 0 && res > 0; i--) {
                if (res == K[i - 1][w]) continue;
                else {
                    hs.add(i - 1);
                    res = res - del[i - 1];
                    w = w - ti[i - 1];
                }
            }
            for (int i = 0; i < n; i++) {
                if (!hs.contains(i)) max = Math.max(max, del[i]);
            }

            out.println(K[n][T] + max);

        }

        class node {
            int time;
            int del;

            node(int time, int del) {
                this.time = time;
                this.del = del;
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

