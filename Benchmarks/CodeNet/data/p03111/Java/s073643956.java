import java.util.*;
import java.io.*;
 
public class Main {
    static int n,a,b,c;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        arr = sc.nextIntArray(n);
        System.out.println(dfs(0,0,0,0));
    }
    
    public static int dfs(int now, int A, int B, int C){
        if(now == n){
            if(A > 0 && B > 0 && C > 0){
                return Math.abs(A-a)+Math.abs(B-b)+Math.abs(C-c)-30;
            }else{
                return (int)Math.pow(10,9);
            }
        }
        int ret = Integer.MAX_VALUE;
        ret = Math.min(ret,dfs(now+1,A,B,C));
        ret = Math.min(ret,dfs(now+1,A+arr[now],B,C)+10);
        ret = Math.min(ret,dfs(now+1,A,B+arr[now],C)+10);
        ret = Math.min(ret,dfs(now+1,A,B,C+arr[now])+10);
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
