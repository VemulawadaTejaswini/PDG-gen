import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTriangularRelationship solver = new CTriangularRelationship();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTriangularRelationship {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            long n = sc.nextInt();
            long k = sc.nextInt();
            long ans = 0;
            for (int a = 1; a <= n; a++) {
                if (((a % k) * 2) % k == 0) {
                    long nb = (n / k);
                    if (a % k != 0 && n % k >= a % k) {
                        nb++;
                    }
                    ans += nb * nb;
                }
            }
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

