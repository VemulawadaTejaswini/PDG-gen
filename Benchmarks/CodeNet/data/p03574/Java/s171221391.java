
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] matrix = new int[H+2][W+2];
        String[] source = new String[H+1];
        for (int i  = 0 ; i < H+2 ; i++) {
            Arrays.fill(matrix[i], 0);
        }
        for (int i = 1 ; i <= H ; i++) {
            source[i] = in.nextToken();
        }
        for (int i = 1 ; i <= H ; i++) {
            for (int j = 1 ; j <= W ;j++) {
                if (source[i].charAt(j-1) == '#') {
                    matrix[i-1][j-1]++;
                    matrix[i-1][j]++;
                    matrix[i-1][j+1]++;
                    matrix[i][j-1]++;
                    matrix[i][j+1]++;
                    matrix[i+1][j-1]++;
                    matrix[i+1][j]++;
                    matrix[i+1][j+1]++;
                }
            }
        }
        for (int i = 1 ; i <= H ; i++) {
            for (int j = 1 ; j <= W ;j++) {
                if (source[i].charAt(j - 1) == '#') {
                    out.print('#');
                } else {
                    out.print(matrix[i][j]);
                }
            }
            out.println("");
        }
    }

    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}