import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfLargeNumbers solver = new DSumOfLargeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfLargeNumbers {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long min = 0;
            long max = 0;
            long ans = 0;
            for (int i = 0; i < n + 1; i++) {
                min += i;
                max += n - i;
                if (max < min)
                    break;
                if (i + 1 >= m)
                    ans += max - min + 1;
                ans %= (int) 1e9 + 7;
            }
            pw.println(ans);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

