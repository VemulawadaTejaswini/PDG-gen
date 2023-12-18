import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        ArrayList<Long> al = getPrimeList(a);
        long ans = 1;
        for(long v : al){
            if(v > a/n){
                break;
            }else{
                ans = Math.max(ans,v);
                if(a/v <= a/n){
                    ans = Math.max(ans,a/v);
                }
            }
        }
        System.out.println(ans);
    }
    
    private static ArrayList<Long> getPrimeList(long l){
        ArrayList<Long> ret = new ArrayList<Long>();
        if(l < 2) return ret;
        ret.add(2L);
        long max = (long)Math.sqrt(l);
        for(long i = 3; i <= max; i++){
            if(l % i == 0)ret.add(i);
        }
        return ret;
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
