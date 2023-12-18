
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    void solve() {
        //price
        long cheap = Long.MAX_VALUE;
        long price = 0;

        long Q = in.nextLong()*8;
        if (Q < cheap) {
            cheap = Q;
            price = cheap/2;
        }
        long H = in.nextLong()*4;
        if (H < cheap) {
            cheap = H;
            price = cheap/2;
        }
        long S = in.nextLong()*2;
        if (S < cheap) {
            cheap = S;
            price = cheap/2;
        }
        long D = in.nextLong();
        //total
        long N = in.nextLong();
        if (N < 2 || cheap < D) {
            out.println(N*price);
        }else{
            long temp = N/2;
            long remain = N%2;
            out.println(temp * D + remain * price);
        }
    }



    FastScanner in;
    PrintWriter out;

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

    public static void main(String[] args) {
        new Main().run();
    }

}