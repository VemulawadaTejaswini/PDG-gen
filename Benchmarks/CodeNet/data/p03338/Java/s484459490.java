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
                int[] numleft, numright;
                int ans = 0;
                n = cin.nextInt(); s = cin.next();
                numleft = new int[26]; numright = new int[26];
                for (int i = 0; i < n - 1; ++i) {
                    Arrays.fill(numleft, 0);
                    Arrays.fill(numright, 0);
                    for (int j = 0; j < i + 1; ++j) numleft[s.charAt(j) - 'a'] = 1;
                    for (int j = i + 1; j < n; ++j) numright[s.charAt(j) - 'a'] = 1;
                    int temp = 0;
                    for (int j = 0; j < 26; ++j) temp += numleft[j] * numright[j];
                    ans = Math.max(ans, temp);
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