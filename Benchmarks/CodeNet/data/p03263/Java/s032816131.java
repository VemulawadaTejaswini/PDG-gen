import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
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
        DMakeThemEven solver = new DMakeThemEven();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMakeThemEven {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int[][] arr = new int[h + 1][w + 1];
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            StringBuilder res = new StringBuilder();
            int op = 0;
            outer:
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (i == h && j == w) break outer;
                    if (j < w && arr[i][j] % 2 == 1) {
                        res.append(i).append(" ").append(j).append(" ").append(i).append(" ").append(j + 1).append("\n");
                        arr[i][j + 1]++;
                        op++;
                    } else if (j == w && arr[i][j] % 2 == 1) {
                        res.append(i).append(" ").append(j).append(" ").append(i + 1).append(" ").append(j).append("\n");
                        arr[i + 1][j]++;
                        op++;
                    }
                }
            }
            out.println(op);
            out.println(res);
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

    }
}

