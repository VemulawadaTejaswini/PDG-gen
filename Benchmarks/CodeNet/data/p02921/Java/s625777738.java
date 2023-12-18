import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        
        String a = sc.next();
        String b = sc.next();

        int cnt=0;

        for(int i=0; i<3; i++){
            if(a.charAt(i)==b.charAt(i)){
                cnt++;
            }
        }

        System.out.println(cnt);

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