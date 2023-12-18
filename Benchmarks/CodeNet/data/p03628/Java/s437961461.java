import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = 1000000007L;
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s1 = sc.next().toCharArray();
        char[] s2 = sc.next().toCharArray();
        long ans = 1;
        long prev = 0;
        for(int i = 0; i < n; i++){
            if(s1[i] == s2[i]){
                ans *= (3-prev);
                prev = 1;
            }else{
                if(prev != 2){
                    ans *= (3-prev)*(2-prev);
                }else{
                    ans *= 3;
                }
                prev = 2;
                i++;
            }
            ans %= mod;
        }
        System.out.println(ans);
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
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
