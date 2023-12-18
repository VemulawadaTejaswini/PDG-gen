//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1_000_000;

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

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        new Main().c();
        out.flush();
    }
    
    int mod = 1_000_000_007;

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

    long comb(int n, int k)
    {
        if(n < 0 || k < 0 || k > n) return 0;

        return (((f[n] * ff[k]) % mod) * f[n - k]) % mod;
    }

    long[] f = new long[2_000_010], ff = new long[2_000_010];

    void f() throws Exception
    {
        
    }

    void e2(int n, int k)
    {
        for(int i = 0; i <= n; i++)
        {
            int a = i;
            int c = 0;
            while(a > 0)
            {
                if(a % 10 != 0) c++;
                a /= 10;
            }
            if(c == k) System.out.println(i);
        }
    }

    long ehelper(String str, int k)
    {
        int idx = 0;
        while(str.charAt(idx) == '0') idx++;
        str = str.substring(idx);
        char[] chs = str.toCharArray();
        int n = chs.length;
        if(n < k)
        {
            // System.out.println(0);
            return 0;
        }
        long sum = 0;

        if(k == 1)
        {
            sum += chs[0] - '0';
            sum += (n - 1) * 9;
        }
        if(k == 2)
        {
            int val = chs[0] - '0';
            sum += (n - 1) * (n - 2) / 2 * 81;
            for(int i = 1; i < val; i++)
            {
                sum += (n - 1) * 9;
            }
            for(int i = 1; i < n; i++) {
                if(chs[i] != '0')
                {
                    sum += chs[i] - '0';
                    sum += 9 * (n - i - 1);
                    break;
                }
            }
        }
        if(k == 3)
        {
            int val = chs[0] - '0';
            sum += (n - 1) * (n - 2) * (n - 3) / 6 * 729;
            for(int i = 1; i < val; i++)
            {
                sum += (n - 1) * (n - 2) / 2 * 81;
            }
            // System.out.println("..." +sum);
            sum += ehelper(str.substring(1), k - 1);
        }
        
        return sum;
    }


    void e() throws Exception
    {
        String str = in.readLine();
        int k = readInt();
        
        // e2(Integer.valueOf(str), k);
        System.out.println(ehelper(str, k));
    }

    long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    void d() throws Exception
    {
        String[] sp = split();
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]);
        sp = split();

        double[] db = new double[n];
        for(int i = 0; i < n; i++)
        {
            int v = Integer.valueOf(sp[i]);
            int sum = (1 + v) * v / 2;
            double avg = 1.0 * sum / v;
            db[i] = avg;
        }

        // every k window
        double maxi = 0.0;
        double runsum = 0.0;

        for(int i = 0; i < n; i++)
        {
            runsum += db[i];
            if(i >= k - 1)
            {
                if(i >= k) runsum -= db[i - k];
                maxi = Math.max(maxi, runsum);
            }
        }
        System.out.println(maxi);

    }
    
    boolean satisfy(int a, int b)
    {
        String s1 = String.valueOf(a),
                s2 = String.valueOf(b);
        int m = s1.length(), n = s2.length();
        if(s1.charAt(0) == s2.charAt(n - 1) && 
            s1.charAt(m - 1) == s2.charAt(0)) return true;
        return false;
    }

    void c() throws Exception
    {
        int n = readInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        int maxi = 0;

        for(int i = 0; i< n; i++)
        {
            String str = in.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            maxi = Math.max(maxi, map.get(str));
        }

        for(String str : map.keySet())
        {
            if(map.get(str) == maxi)
                out.println(str);
        }
    }

    void b() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        boolean flag = true;
        for(int k : ary)
        {
            if((k & 1) == 0)
            {
                if(k % 3 != 0 && k % 5 != 0)
                {
                    flag = false;
                }
            }
        }
        if(flag) System.out.println("APPROVED");
        else System.out.println("DENIED");
    }

    void a() throws Exception
    {
        int[] ary = toIntArray();
        Arrays.sort(ary);
        if(ary[0] == ary[1] && ary[1] != ary[2])
        {
            out.println("Yes");
        }
        else if(ary[0] != ary[1] && ary[1] == ary[2])
        {
            out.println("Yes");
        }
        else out.println("No");
    }
}