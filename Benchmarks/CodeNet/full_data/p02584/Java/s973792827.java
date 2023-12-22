import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static FastIO io = new FastIO("in.txt");

    public static void main(String[] args) throws Exception {
        long X, K, D;
        X = io.nextLong(); K = io.nextLong(); D = io.nextLong();
        X = Math.abs(X);
        long ans = X % D;

        long n = X / D;
        if(n < K){
            if((K - n) % 2 == 0) {
                ans = X % D;
            }else{
                ans = D - (X % D);
            }
        }else{
            ans = X - K * D;
        }

        io.println(ans);
        io.flush();
    }

    static class FastIO {
        static StringBuilder sb = new StringBuilder();
        static BufferedReader br;
        static StringTokenizer st;
        static PrintStream ps = new PrintStream(System.out);

        public FastIO(String fname) {
            try {
                File input = new File(fname);
                if (input.exists()) {
                    System.setIn(new FileInputStream(fname));
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        void flush(){
            System.out.print(sb.toString());
            sb.setLength(0);
        }

        void print(Object o){
            sb.append(o);
        }

        void println(Object o){
            sb.append(o);
            sb.append('\n');
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
