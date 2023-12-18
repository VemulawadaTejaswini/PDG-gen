
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        int useful = X - Z;
        int block = Y + Z;
        out.println(useful/block);

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