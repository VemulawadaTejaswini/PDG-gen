import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
       MyScanner sc = new MyScanner();
       int K = sc.nextInt();
       int X = sc.nextInt();

       String ans = "";
       for (int i=0; i<2*K-1; i++){
           ans += X-K+1+i;
           ans += " ";
       }
       System.out.println(ans);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
    
        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}