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
        BBattle solver = new BBattle();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBattle {
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int health = sc.nextInt(), strength = sc.nextInt();
            int health2 = sc.nextInt(), strength2 = sc.nextInt();
            boolean first = true;
            while (health > 0 && health2 > 0) {
                if (first) {
                    health2 -= strength;
                } else {
                    health -= strength2;
                }
                first = !first;
            }
            pw.println(health <= 0 ? "No" : "Yes");
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

