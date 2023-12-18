import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int ans = 0;
        if (A >= B){
            ans = 1;
        }
        else{
            ans = 1;
            B -= A;
            while (true){
                if (B - A + 1 > 0){
                    B -= (A-1);
                    ans++;
                }
                else {
                    ans++;
                    break;
                }
            }
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