//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1_000_000, mod = 1_000_000_007;



    void swap(int[]ary, int i, int j)
    {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
    
    String[] split() throws Exception
    {
        return in.readLine().split(" ");
    }

    int readInt() throws Exception
    {
        return Integer.valueOf(in.readLine());
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }


    long pow(long a, int pow)
    {
        long res = 1;
        while(pow > 0)
        {
            if(pow % 2 != 0) {
                res *= a;
                res %= mod;
            }
            a = a * a;
            a %= mod;
            pow /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");
        char[] gg = in.readLine().toCharArray();}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        
        new Main().d();
        out.flush();
    }

    void e() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], k = ary[1];
        int mod = 1_000_000_007;

    }

    void d() throws Exception
    {
        int n = readInt();
        String str = in.readLine();
        int[] vals = new int[n];

        int[][] pos = new int[4][n];
        int[] idx = new int[4];

        for(int i = 0; i < n; i++)
        {
            char c = str.charAt(i);
            if(c == 'R') vals[i] = 1;
            if(c == 'G') vals[i] = 2;
            if(c == 'B') vals[i] = 3;

            int val = vals[i];
            pos[val][idx[val]] = i;
            idx[val]++;
            // for(int[] pp : pos) System.out.println(Arrays.toString(pp));
            // System.out.println(Arrays.toString(idx));
            // System.out.println("..");
            
        }

        int re = 0;

        for(int i = 0; i < n; i++)
        {
            int v1 = vals[i];
            for(int j = i + 1; j < n; j++)
            {
                int v2 = vals[j];
                if(v1 == v2) continue;
                int v3 = v1 ^ v2;
                
                int ans = find(pos[v3], idx[v3], j + 1);
                re += ans;
                int offset = j - i;
                if(j + offset < n && vals[j + offset] == v3)
                {
                    // System.out.println(j + offset);
                    re--;
                }
            }
        }

        out.println(re);
    }

    int find(int[] ary, int n, int targ)
    {
        if(n < 1) return 0;
        int lo = 0, hi = n - 1;
        while(lo < hi)
        {
            int m = (lo + hi) / 2;
            if(ary[m] < targ) lo = m + 1;
            else hi = m;
        }
        // lo - 0 is number of items >= j + 1
        if(ary[lo] < targ) lo++;
        return n - lo;
    }

    void lun(int k)
    {
        int a = 1, idx = 1;
        while(k > 0)
        {
            if(isLun(a))
            {
                System.out.printf("%d %d\n", idx++, a);
                k--;
            }
            a++;
        }
    }

    boolean isLun(int n)
    {
        String str = String.valueOf(n);
        int len = str.length();
        for(int i = 0; i < len - 1; i++)
        {
            char c1 = str.charAt(i), c2 = str.charAt(i + 1);
            if(Math.abs(c1 - c2) > 1) return false;
        }
        return true;
    }

    void c() throws Exception
    {
        int t = readInt();
        int[][][] g = new int[t + 1][t + 1][t + 1];
        long sum = 0;

        for(int i = 1; i <= t; i++)
        {
            for(int j = 1; j <= t; j++)
            {
                for(int k = 1; k <= t; k++)
                {
                    g[i][j][k] = gcd(gcd(i, j), k);
                    sum += g[i][j][k];
                }
            }
        }
        out.println(sum);
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int n_ = readInt();
        long n = (long) n_;
        long sum = n * (n + 1) / 2;
        long m1 = n / 3, m2 = n / 5, m3 = n / 15;
        // out.println(sum);

        sum -= 3 * m1 * (m1 + 1) / 2 + 
               5 * m2 * (m2 + 1) / 2 - 
               15 * m3 * (m3 + 1) / 2;

        out.println(sum);
    }

    void a() throws Exception
    {
        int n = readInt();
        boolean flag = false;
        while(n > 0)
        {
            if(n % 10 == 7) flag = true;
            n /= 10;
        }
        if(flag) out.println("Yes");
        else out.println("No");
    }
}