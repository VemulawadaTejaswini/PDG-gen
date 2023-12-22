
import java.io.*;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 */
public class ProbA {
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
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            long preA[] = new long[n + 1];
            long preB[] = new long[m + 1];
            int max = 0;
            for (int i = 1; i < n + 1; i++){
                preA[i] = preA[i - 1] + in.nextInt();
            }
            for (int i = 1; i < m + 1; i++){
                preB[i] = preB[i - 1] + in.nextInt();
            }
            int cnt = 0;
            int i = 0;
            while (i <= n){
                if (preA[i] <= k){
                    i++;
                }
                else{
                    break;
                }
            }
            i--;
            max = i;
            int j = 1;
            for (int t = i; t >= 0; t--){
                while (j <= m){
                    if (preB[j] + preA[t] <= k){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                j--;
                if (j == m){
                    max = Math.max(max, t + m);
                    break;
                }
                else{
                    max = Math.max(max, t + j);
                }
            }
            out.println(max);
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