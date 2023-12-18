import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        InputStream in = System.in;
        OutputStream out = System.out;
        FastScanner fs = new FastScanner(in);
        PrintWriter pw = new PrintWriter(out);
        int N = fs.nextInt(), ans = 0;
        String S = fs.next();
        for(int i = 0; i < N; i++) {
            int count = 0;
            char target = S.charAt(i);
            if(i != N - 1) {
                for(int j = i + 1; j < S.length(); j++) {
                    if(S.charAt(j) == target) count++;
                    /*System.out.print(i + ", " + j + ": ");
                    System.out.print(target);
                    System.out.println(S.charAt(j));*/
                }
            }
            ans += factorial(N - count) / factorial(i) / factorial(N - i);
        }
        pw.println(ans % 1000000007);
        pw.close();
    }
    
    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
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
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
 
    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }
 
    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }
 
}
