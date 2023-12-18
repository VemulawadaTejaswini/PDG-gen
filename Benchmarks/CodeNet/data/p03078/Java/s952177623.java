import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DCake123 solver = new DCake123();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCake123 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int k = in.nextInt();
            Long[] a = new Long[x];
            for (int i = 0; i < x; i++) {
                a[i] = in.nextLong();
            }
            Long[] b = new Long[y];
            for (int i = 0; i < y; i++) {
                b[i] = in.nextLong();
            }
            Long[] c = new Long[z];
            for (int i = 0; i < z; i++) {
                c[i] = in.nextLong();
            }
            Long[] bc = new Long[y * z];
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < z; j++) {
                    bc[i * z + j] = b[i] + c[j];
                }
            }
            shuffleArray(bc);
            Arrays.sort(bc, Comparator.reverseOrder());
            Long[] fin = new Long[bc.length * a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < bc.length; j++) {
                    fin[bc.length * i + j] = a[i] + bc[j];
                }
            }
            shuffleArray(fin);
            Arrays.sort(fin);
            StringBuilder sb = new StringBuilder();
            int s = fin.length;
            for (int i = 0; i < k; i++) {
                sb.append(fin[s - i - 1]).append("\n");
            }
            out.println(sb);
        }

        static void shuffleArray(Long[] ar) {
            // If running on Java 6 or older, use `new Random()` on RHS here
            Random rnd = ThreadLocalRandom.current();
            for (int i = ar.length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                // Simple swap
                Long a = ar[index];
                ar[index] = ar[i];
                ar[i] = a;
            }
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

