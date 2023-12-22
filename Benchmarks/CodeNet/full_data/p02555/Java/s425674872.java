import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
    //WRWWRWRR     wwwrrrrwwwwrrr
    ///112 112
    ///1223 12

    int mod = (int) 1e9+7;
    public void solve(int testNumber, InputReader in, PrintWriter out) {

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        //long n = Long.parseLong(scanner.nextLine());
        int n = scanner.nextInt();
        int mod = (int) 1e9+7;
        long[] dp = new long[n+1];
        //dp[3] = 1;
        for(int i=3;i<=n;i++) dp[i] = 1;
        for(int i=3;i<=n;i++){
            for(int j=3;j<=i;j++){
                if(i-j<3) continue;
                dp[i] += dp[j];
                dp[i]%=mod;
            }
        }
        System.out.println(dp[n]);

    }
    //	public static void main(String[] args){
//        InputStream inputStream = System.in;
//        OutputStream outputStream = System.out;
//        InputReader in = new InputReader(inputStream);
//        PrintWriter out = new PrintWriter(outputStream);
//        Main solver = new Main();
////        int num = in.nextInt();
////        while(num-->0){
////            solver.solve(1, in, out);
////        }
//        solver.solve(1, in, out);
//        out.close();
//    }
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}