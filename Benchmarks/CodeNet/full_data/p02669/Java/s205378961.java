import java.util.*;
import java.io.*;

public class Main {
    static HashMap<Long,Long> map;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0; tt < t; tt++){
            map = new HashMap<Long,Long>();
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            map.put(0L,0L);
            map.put(1L,d);
            System.out.println(dfs(n,a,b,c,d));
        }
    }
    
    public static long dfs(long now, long a, long b, long c, long d){
        if(map.containsKey(now)){
            return map.get(now);
        }
        long ret;
        if(now*d < 0){
            ret = Long.MAX_VALUE;
        }else{
            ret = now * d; 
        }
        if(now % 2 == 0){
            ret = Math.min(ret,dfs(now/2,a,b,c,d) + a);
        }else{
            ret = Math.min(ret,dfs((now-1)/2,a,b,c,d) + a + d);
            ret = Math.min(ret,dfs((now+1)/2,a,b,c,d) + a + d);
        }
        if(now % 3 == 0){
            ret = Math.min(ret,dfs(now/3,a,b,c,d) + b);
        }else{
            long mod = now % 3;
            ret = Math.min(ret,dfs((now-mod)/3,a,b,c,d) + b + mod * d);
            ret = Math.min(ret,dfs((now+(3-mod))/3,a,b,c,d) + b + (3-mod) * d);
        }
        if(now % 5 == 0){
            ret = Math.min(ret,dfs(now/5,a,b,c,d) + c);
        }else{
            long mod = now % 5;
            ret = Math.min(ret,dfs((now-mod)/5,a,b,c,d) + c + mod * d);
            ret = Math.min(ret,dfs((now+(5-mod))/5,a,b,c,d) + c + (5-mod) * d);
        }
        map.put(now,ret);
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
