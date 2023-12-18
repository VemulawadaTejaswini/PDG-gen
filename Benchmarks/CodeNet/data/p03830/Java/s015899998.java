import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public static int count(int a , int b){
            int v = 0;
            while(a > 1){
                if (a % b == 0){
                    v++;
                    a/=b;
                }
                else break;
            }
            return v;


        }
        public void solve(int testNumber , InputReader in , PrintWriter out){
            int n = in.nextInt();
            long ans = 1;
            boolean[] arr = new boolean[n+1];
            for (int i = 2; i <=n ; i++) {
                arr[i]=true;
            }
            for (int i = 2; i <= n ; i++) {
                if (arr[i]){
                    int v = 2;
                    for (int j = i+i; j <=n ; j+=i) {
                        v+=count(j , i);
                        arr[j]=false;

                    }
                    ans*=v;
                    ans%=1000000000+7;
                }
            }
            out.println(ans%(1000000000+7));





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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

}