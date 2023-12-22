import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 * What a trick prob!
 */
public class Main{
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
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
//            ArrayList<Integer>E[] = new ArrayList[n];
//            for (int i = 0; i < n; i++){
//                E[i] = new ArrayList<>();
//            }
//            for (int i = 0; i < n - 1; i++){
//                int u = in.nextInt() - 1;
//                int v = in.nextInt() - 1;
//                E[u].add(v);
//                E[v].add(u);
//            }
            int a[] = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            long result = a[n - 1];
            int cnt = n - 2;
            int i = n - 2;
            while (cnt > 0){
                if (cnt >= 2){
                    result += 2 * a[i];
                }
                else{
                    result += a[i];
                }
                i--;
                cnt -= 2;
            }
            out.println(result);
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