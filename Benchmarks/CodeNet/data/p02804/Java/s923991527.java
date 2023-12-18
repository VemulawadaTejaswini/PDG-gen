import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {

        public void solve(int testNumber, InputReader in, PrintWriter out){
            int n = in.nextInt();
            int k = in.nextInt();
            long[] fac = new long[n+1];
            fac[0]=1;
            for (int i = 1; i <=n; i++){
                fac[i]=(i*(fac[i-1]%1000000007))%1000000007;
            }
            long[] arr = new long[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            long mins = 0;
            long maxs = 0;
            int j =1;
            for (int i = 0; i+k-1<n ; i++) {
                mins+=(arr[i])*((fac[n-j]/((fac[k-1]*fac[(n-j)-(k-1)])%1000000007))%1000000007);
                mins%=1000000007;
                j++;
            }
            j =1;
            for (int i = n-1; i-(k-1)>=0 ; i--) {
                maxs+=(arr[i])*((fac[n-j]/((fac[k-1]*fac[(n-j)-(k-1)])%1000000007))%1000000007);
                maxs%=1000000007;
                j++;
            }
            System.out.println((maxs-mins)%1000000007);









        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

