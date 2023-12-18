import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int next_combination(int sub) {
            int x = sub & -sub, y = sub + x;
            return (((sub & ~y) / x) >> 1) | y;
        }

        void solve(InputReader in, PrintWriter out) {
            int N = in.nextInt();
            char[] march = new char[] {'M', 'A', 'R', 'C', 'H'};

            Map<Character, Integer> cntByIni = new HashMap<>();
            for (char c : march) cntByIni.put(c, 0);

            for (int i = 0; i < N; i++) {
                char ini = in.next().charAt(0);
                if (cntByIni.containsKey(ini)) {
                    cntByIni.put(ini, cntByIni.get(ini) + 1);
                }
            }

            long ans = 0;
            int mask = (1 << 3) - 1;
            for (; mask < (1 << 5); mask = next_combination(mask)) {
                long pattern = 1;
                for (int i = 0; i < 5; i++) {
                    if ((mask >> i & 1) == 1) {
                        pattern *= cntByIni.get(march[i]);
                    }
                }
                ans += pattern;
            }

            out.println(ans);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}