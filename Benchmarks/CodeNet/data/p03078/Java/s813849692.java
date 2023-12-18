import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Collections;
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
            Arrays.sort(a, Comparator.reverseOrder());
            Long[] b = new Long[y];
            for (int i = 0; i < y; i++) {
                b[i] = in.nextLong();
            }
            Arrays.sort(b, Comparator.reverseOrder());
            Long[] c = new Long[z];
            for (int i = 0; i < z; i++) {
                c[i] = in.nextLong();
            }
            Arrays.sort(c, Comparator.reverseOrder());
            List<Long> fin = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    for (int l = 0; l < z; l++) {
                        if (i * j * l > k) {
                            break;
                        } else {
                            fin.add(a[i] + b[j] + c[l]);
                        }
                    }
                }
            }
            Collections.sort(fin, Comparator.reverseOrder());
            for (int i = 0; i < k; i++) {
                out.println(fin.get(i));
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

