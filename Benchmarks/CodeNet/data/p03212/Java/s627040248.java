import java.util.*;
import java.io.*;
 
public class Main {
    static int ans = 0;
    static long n = 0;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        n = sc.nextInt();
        int[] checked = new int[3];
        dfs("", checked);
        System.out.println(ans);
    }
    
    public static void dfs(String now, int[] chk){
        if(!now.isEmpty() && Long.parseLong(now) <= n && chk[0] >= 1 && chk[1] >= 1 && chk[2] >= 1){
            ans++;
        }else if(!now.isEmpty() && Long.parseLong(now) > n){
            return;
        }
        chk[0]++;
        dfs(now+"3",chk);
        chk[0]--;
        chk[1]++;
        dfs(now+"5",chk);
        chk[1]--;
        chk[2]++;
        dfs(now+"7",chk);
        chk[2]--;
        return;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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