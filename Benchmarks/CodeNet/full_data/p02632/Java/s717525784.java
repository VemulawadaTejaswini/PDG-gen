
import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
    // main solver
    static class Task{
        static int MOD = 1000000007;
        public long pow(long x, long y){
            if (y == 0){
                return 1;
            }
            else{
                long au = pow(x, y >> 1);
                au = (au * au) % MOD;
                if (y % 2 == 0){
                    return au;
                }
                else{
                    return (au * x)% MOD;
                }
            }
        }
        long Ckn(int k, int n){
            long det = 1;
            long num = 1;
            for (int i = 1; i <= k; i++){
                det = (det * i) % MOD;
            }
            for (int i = n - k + 1; i <=n; i++){
                num = (num * i) % MOD;
            }
            return (num * pow(det, MOD - 2)) % MOD;
        }
        public void solve(InputReader in, PrintWriter out){
            int k = in.nextInt();
            String s = in.nextToken();
            int n = s.length();
            long x = pow(25, k);
            long y = Ckn(n, n + k);
            out.println((x * y) % MOD);
        }
    }
    // fast input reader class;
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }
        public long nextLong(){
            return Long.parseLong(nextToken());
        }
    }
}