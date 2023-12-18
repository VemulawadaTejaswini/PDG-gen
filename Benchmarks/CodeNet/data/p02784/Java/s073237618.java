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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskC {
        static long modpow(long a , int b){
            a%=1000000007;
            long ans = 1;
            while (b>0){
                if ((b&1)>0) ans=ans*a%1000000007;
                b>>=1;
                a=a*a%1000000007;
            }
            return ans;
        }
        static long sol(long a){
            if (a==1) return 1;
            long ans = sol(a/2);
            return ans+ans+1;
        }
        public void solve(int testNumber, InputReader in, PrintWriter out){
            int h =in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            for (int i = 0; i <n; i++) {
                sum+=in.nextInt();
            }
            if (sum >= h) System.out.println("Yes");
            else System.out.println("No");






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