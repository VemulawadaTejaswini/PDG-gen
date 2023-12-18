import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null; }
        String next() { while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try { tokenizer = new StringTokenizer(reader.readLine()); } 
                catch (IOException e) { throw new RuntimeException(e);} }
            return tokenizer.nextToken(); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        
        long a = r.nextLong();
        long b = r.nextLong();

        pw.println(factors(gcd(a, b)));

        pw.close();
    }

    static long factors(long n){
        HashSet<Long> factors = new HashSet<Long>();
        factors.add(1L);
        if(n % 2 == 0){
            factors.add(2L);
            while(n % 2 == 0){
                n /= 2;
            }
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0){
                factors.add((long)i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        if(!factors.contains(n)){
            factors.add(n);
        }
        return factors.size();
    }

    static long gcd(long a, long b){
        if(b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

/**
                _        _                 _                                                
               | |      | |               | |                                               
   ___ ___   __| | ___  | |__  _   _    __| | __ _ _ __ _ __ ___ _ __     _   _  __ _  ___  
  / __/ _ \ / _` |/ _ \ | '_ \| | | |  / _` |/ _` | '__| '__/ _ \ '_ \   | | | |/ _` |/ _ \ 
 | (_| (_) | (_| |  __/ | |_) | |_| | | (_| | (_| | |  | | |  __/ | | |  | |_| | (_| | (_) |
  \___\___/ \__,_|\___| |_.__/ \__, |  \__,_|\__,_|_|  |_|  \___|_| |_|   \__, |\__,_|\___/ 
                                __/ |                               ______ __/ |            
                               |___/                               |______|___/             
 */