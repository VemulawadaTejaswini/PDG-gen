import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long max = (long)Math.pow(10,18);
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long a = sc.nextLong();
        String[] s = sc.next().split("\\.");
        long b = Long.parseLong(s[0]+s[1]);
        out.println(a*b/100L);
        out.close();
    }
    
     static HashMap<Long,Integer> getPrimeFactorizationMap(long x) {
        HashMap<Long,Integer> result = new HashMap<Long,Integer>();
        int cnt = 0;
        while (x >= 2L && x % 2L == 0) {
            cnt++;
            x /= 2;
        }
        if(cnt > 0){
            result.put(2L,cnt);
            cnt = 0;
        }
        long d = 3;
        long q = x / d;
        while (q >= d) {
            cnt = 0;
            while (x % d == 0) {
                cnt++;
                x /= d;
            }
            if(cnt > 0){
                result.put(d,cnt);
            }
            d += 2;
            q = x / d;
        }
        if(x != 1) result.put(x,1);
        
        return result;
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