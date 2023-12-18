import java.io.*;
import java.util.StringTokenizer;

public final class Main{
    public static void main(String[] args){
        FastScanner stdIn = new FastScanner(System.in);
        
        long n = stdIn.nextInt();
        long[] a = new long[(int)n];
        for(int i=0; i<(int)n; i++){
            a[i] = stdIn.nextInt();
        }
        
        long up = 1;
        double down = 0.0;
        for(int i=0; i<a.length; i++){
            up *= a[i];
        }
        for(int i=0; i<a.length; i++){
            down += (double)up/a[i];
        }

        System.out.println(((double)up/down);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public long nextInt() {
        return Integer.parseInt(next());
    }

}
