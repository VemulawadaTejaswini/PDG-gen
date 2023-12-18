import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AConnectionAndDisconnection solver = new AConnectionAndDisconnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class AConnectionAndDisconnection {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.next();
            int k = in.nextInt();

            long ans = 0;
            List<Integer> runs = new ArrayList<>();
            for (int i = 0; i < s.length(); ) {
                int j = i;
                while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                    j++;
                }
                runs.add(j - i);
                i = j;
            }
            for (int i : runs) {
                ans += (long) k * (i / 2);
            }
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                if (runs.size() == 1) {
                    ans = (long) k * s.length() / 2;
                } else {
                    ans -= (long) (k - 1) * (runs.get(0) / 2);
                    ans -= (long) (k - 1) * (runs.get(runs.size() - 1) / 2);
                    ans += (long) (k - 1) * ((runs.get(0) + runs.get(runs.size() - 1)) / 2);
                }
            }
            out.println(ans);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

