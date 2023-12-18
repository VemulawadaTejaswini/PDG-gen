import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            final int n = in.nextInt();
            int[] arr = new int[n];
            final int N = n * n;
            final int[] res = new int[N + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                res[arr[i]] = i + 1;
            }
            int sum = 0;
            for (int i = 1; i <= N; ++i) {
                sum += res[i];
                if (i < sum) {
                    out.println("NO");
                    return;
                }
            }
            List<Integer> order = new ArrayList<>();
            for (int i = 1; i<=N; ++i) {
                if (res[i] > 0) order.add(res[i]);
            }
            int pos = 0;
            int cnt = n - 1;
            for (int i =1 ; i <=N; ++i) {
                if (res[i] > 0) continue;
                if (cnt == 0) {
                    pos++;
                    if (pos == order.size())
                        break;
                    cnt = n - 1;
                }
                res[i] = order.get(pos);
                cnt--;
            }
            out.println("Yes");
            for (int i = 1; i <= N; ++i) {
                if (i > 1) out.print(" ");
                out.print(res[i]);
            }
            out.println();

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


