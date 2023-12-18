import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int q = sc.nextInt();
        Sieve s = new Sieve(100001);
        int[] ans = new int[100001];
        for(int i = 2; i < 100001; i++){
            if(s.isPrime(i) && s.isPrime((i+1)/2)){
                ans[i]++;
            }
            ans[i] += ans[i-1];
        }
        for(int i = 0; i < q; i++){
            int cnt = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l % 2 == 0)l++;
            if(r % 2 == 0)r--;
            System.out.println(ans[r]-ans[l-1]);
        }
    }
}

class Sieve{
    static int n;
    static int[] f;
    static ArrayList<Integer> prime;
    public Sieve(int n){
        long ln = n;
        prime = new ArrayList<Integer>();
        f = new int[n+1];
        f[0] = f[1] = -1;
        for(int i = 2; i <= n; i++){
            if(f[i] != 0){
                continue;
            }
            f[i] = i;
            prime.add(i);
            long li = (long)i;
            for(long j = li*li; j <= ln; j += li){
                if(f[(int)j] == 0){
                    f[(int)j] = i;
                }
            }
        }
    }
    
    public static boolean isPrime(int x){
        return f[x] == x;
    }
    
    public static ArrayList<Integer> factorList(int x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(x != 1){
            res.add(f[x]);
            x /= f[x];
        }
        return res;
    }
    
    public static HashMap<Integer,Integer> factor(int x){
        ArrayList<Integer> fl = factorList(x);
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        if(fl.size()==0){
            return new HashMap<Integer,Integer>();
        }
        int prev = fl.get(0);
        int cnt = 0;
        for(int p : fl){
            if(prev == p){
                cnt++;
            }else{
                res.put(prev,cnt);
                prev = p;
                cnt = 1;
            }
        }
        res.put(prev,cnt);
        return res;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
