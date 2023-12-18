import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
        EAllYouCanEat solver = new EAllYouCanEat();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAllYouCanEat {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int T = in.nextInt();
            int K[][] = new int[n + 1][T + 1];
            int Time[][] = new int[n + 1][T + 1];
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
            int dp[][] = new int[n + 1][2];
            for (int i = 1; i <= n; i++) {
                for (int t = 1; t <= T; t++) {
                    if (Time[i - 1][t] < t && K[i][t] < del[i - 1] + K[i - 1][t]) {

                        K[i][t] = del[i - 1] + K[i - 1][t];
                        Time[i][t] = Time[i - 1][t] + ti[i - 1];
                    } else {
                        K[i][t] = K[i - 1][t];
                        Time[i][t] = Time[i - 1][t];
                    }
                }
            }
//       for(int i=0;i<=n;i++){
//           for(int t=0;t<=T;t++){
//               out.print(K[i][t] + " ");
//           }
//           out.println("YES");
//       }
            out.println(K[n][T-1]);

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

