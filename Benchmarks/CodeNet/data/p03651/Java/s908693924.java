import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author OmarYasser
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        public void solve(int testNumber, Scanner sc, PrintWriter out) {
            int n = sc.nextInt(), k = sc.nextInt();
            int gcd = sc.nextInt(), max = gcd;
            for (int i = 1; i < n; i++) {
                int x;
                gcd = gcd(gcd, x = sc.nextInt());
                max = Math.max(max, x);
            }
            if (k <= max && k % gcd == 0) out.println("POSSIBLE");
            else out.println("IMPOSSIBLE");
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }

        public String next() {
            while (st == null || !st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

