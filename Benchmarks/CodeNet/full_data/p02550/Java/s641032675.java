import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Main{

    //static long MOD = 1000000007L;
    static long MOD = 998244353L;
    static long [] fac;
    static int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static long lMax = 0x3f3f3f3f3f3f3f3fL;
    static int iMax = 0x3f3f3f3f;
    static HashMap <Long, Long> memo = new HashMap();
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;

        while(t-- > 0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long m = sc.nextLong();
            long res[] = new long[(int)m + 1];
            long pre[] = new long[(int)m + 1];
            long ans = 0L;
            long loop = 0L;
            int ind = 1;
            HashMap <Long, Integer> map = new HashMap();
            map.put(x, 1);
            res[0] = x;
            long cur = x;
            long total = x;
            int prev = -1;
            for(;ind < n; ind++) {
                cur = (cur * cur) % m;
                if(map.get(cur) != null){
                    prev = map.get(cur);
                    res[ind] = cur;
                    break;
                }
                map.put(cur, ind);
                res[ind] = cur;
                total += cur;
                if(cur == 0) {
                    out.println(total);
                    out.close();
                    return;
                }
            }
            long[] tmp = Arrays.copyOfRange(res, 0, ind);
            for(int i = 0; i < prev; i ++)
                ans += res[i];
            if(prev <  0) prev = 0;
            n -= prev;
            int loopSize = ind - prev;
            for(int i = prev; i < ind; i++)
                loop += res[i];
            ans += loop * (n / loopSize);
            n %= loopSize;
            for(int i = 0; i < n; i++)
                ans += res[i + prev];
            out.println(ans);
        }
        out.close();
    }
    public static int lowerBound(int[] a, int v){ return lowerBound(a, 0, a.length, v); }
    public static int lowerBound(int[] a, int l, int r, int v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] >= v){
                high = h;
            }else{
                low = h;
            }
        }
        return high;
    }
    public static long C(int n, int m)
    {
        if(m == 0 || m == n) return 1l;
        if(m > n || m < 0) return 0l;
        long res = fac[n] * quickPOW((fac[m] * fac[n - m]) % MOD, MOD - 2) % MOD;

        return res;
    }
    public static long quickPOW(long n, long m)
    {
        long ans = 1l;
        while(m > 0)
        {
            if(m % 2 == 1)
                ans = (ans * n) % MOD;
            n = (n * n) % MOD;
            m >>= 1;
        }
        return ans;
    }
    public static int gcd(int a, int b)
    {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
    public static long gcd(long a, long b)
    {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
    public static long solve(long cur){
        return 0L;
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
