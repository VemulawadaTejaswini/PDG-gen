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
        long n = Long.parseLong(scanner.nextLine());
        int mod = (int) 1e9+7;
        int N = (int)1e6+3;
        long a=1,b=0,c=0,d=0;
        for(int i=1;i<=n;i++){
            long a1 = a*8;
            long b1 = b*9+a;
            long c1 = c*9+a;
            long d1 = b+c+d*10;
            a = a1%mod;b =b1%mod;c=c1%mod;d=d1%mod;
        }
        System.out.println(d);

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