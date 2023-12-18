import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/testdata.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/testData.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver();
            solver.solve(in, out);
            out.close();
            // fin.close();
            // fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver
    {

        public void solve (InputReader cin, PrintWriter cout)
        {
            try {
                int n;
                String s;
                int[] numW, numE;
                int ans;
                n = cin.nextInt(); s = cin.next();
                numW = new int[n + 2]; numE = new int[n + 2];
                Arrays.fill(numW, 0); Arrays.fill(numE, 0);
                for (int i = 1; i < n + 1; ++i) {
                    if (s.charAt(i - 1) == 'W') {
                        numW[i] = numW[i - 1] + 1;
                        numE[i] = numE[i - 1];
                    } else {
                        numE[i] = numE[i - 1] + 1;
                        numW[i] = numW[i - 1];
                    }
                }
                ans = Integer.MAX_VALUE;
                for (int i = 1; i < n + 1; ++i) {
                    ans = Math.min(ans, numW[i - 1] - numW[0] + numE[n] - numE[i]);
                }
                cout.println(ans);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
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

        public long nextLong () {
            return Long.parseLong(next());
        }

        public double nextDouble () {
            return Double.parseDouble(next());
        }

    }

}