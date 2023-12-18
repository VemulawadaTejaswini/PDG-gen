//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static String file = "../in";

    public static void main(String[] args) throws Exception
    {
        int test = 10,   // 0 for local testing, 1 for std input
            _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}

        new Main().e();

    }

    void f() throws Exception
    {
        int n = Integer.valueOf(in.readLine());

        int[] x = new int[n], y = new int[n];

        for(int i = 0; i < n; i++) {
            String[] sp = in.readLine().split(" ");
            x[i] = Integer.valueOf(sp[0]);
            y[i] = Integer.valueOf(sp[1]);
        }
        // find maximum distance between any two points?

        double d = Double.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            d = Math.min(d, rad(x, y));
        }
        System.out.println(d);
    }

    double rad(int[] x, int[] y)
    {
        double lo = 0., hi = Double.MAX_VALUE;
        double err = 0.0000001;
        while(hi - lo > err)
        {
            double m = (lo + hi) / 2.;
            if(!covers(x, y, m)) lo = m;
            else hi = m;
        }
        return lo;
    }

    boolean covers(int[] x, int[] y, double rad)
    {
        int n = x.length;
        double sq = (rad * 2) * (rad * 2);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int dx = x[i] - x[j], dy = y[i] - y[j];
                if(sq <= dx * dx + dy * dy) return false;    
            }
            
        }
        return true;
    }

    void e() throws Exception
    {
        int n = Integer.valueOf(in.readLine());
        String[] sp = in.readLine().split(" ");
        // gcd , lcm
        // gcd = gcd(a, b)
        // lcm = a * b / gcd
        long gcd = 1, lcm = 1;
        int mod = 1_000_000_007;
        int[] ary = new int[n];
        boolean[] vis = new boolean[1_000_010];
        Arrays.fill(vis, true);
        int[] primes = new int[1_000_010];

        int idx = 0;

        for(int i = 2; i < 1_000_000; i++)
        {
            if(vis[i])
            {
                primes[idx++] = i;
            
                for(int j = 2; j < 1_000_010 / i; j++)
                {
                    vis[i * j] = false;
                }
            } 
        }
        
        // for(int i = 0; i < idx; i++) System.out.println(primes[i]);
        
        int[] pcounts = new int[idx];

        for(int i = 0; i < n; i++) 
        {
            ary[i] = Integer.valueOf(sp[i]);
            // factorial it
            int val = ary[i];

            for(int j = 0; j < idx; j++)
            {
                if(val == 1) break;
                int count = 0;
                int prime = primes[j];
                while(val % prime == 0)
                {
                    val /= prime;
                    count++;
                }
                // System.out.printf("%d %d %d\n", ary[i], prime, count);
                pcounts[j] = Math.max(pcounts[j], count);
            }
        }

        // for(int j = 0; j < idx; j++)
        // {
        //     System.out.printf("%d %d\n", primes[j], pcounts[j]);
        // }

        long sum = 0;
        for(int i = 0; i < n; i++) 
        {
            int val = ary[i];
            long prod = 1;
            for(int j = 0; j < idx; j++)
            {
                if(pcounts[j] == 0) continue;
                // if(val == 1) break;
                int count = 0;
                int prime = primes[j];
                while(val % prime == 0)
                {
                    val /= prime;
                    count++;
                }
                // System.out.printf("%d %d %d\n", ary[i], pcounts[j], count);
                prod *= pow(primes[j], pcounts[j] - count);
            }
            // System.out.println(prod);
            sum = (sum + prod) % mod;
        }        

        System.out.println(sum % mod);
    }

    boolean isPrime(int k, int[] p, int idx)
    {
        if(k < 2) return false;
        if(k < 4) return true;
        if(k % 2 == 0) return false;
        for(int i = 0; i < idx; i++)
        {
            if(k % p[i] == 0) return false;
        }
        return true;
    }

    long pow(int a, int b)
    {
        if(b == 0) return 1;
        if(b == 1) return a;
        long pp = pow(a, b / 2);
        pp *= pp;
        if(b % 2 != 0) return pp * a;
        return pp;
    }

    long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    void d() throws Exception
    {
        int n = Integer.valueOf(in.readLine());

        int[][] f = new int[10][10];
        int re = 0;

        for(int a = 1; a <= n; a++)
        {
            String s = String.valueOf(a);
            int m = s.length(),
                a0 = s.charAt(0) - '0',
                a1 = s.charAt(m - 1) - '0';
            f[a0][a1]++;
        }

        for(int a = 1; a <= n; a++)
        {
            String s = String.valueOf(a);
            int m = s.length(),
                a0 = s.charAt(0) - '0',
                a1 = s.charAt(m - 1) - '0';
            re += f[a1][a0];
        }

        System.out.println(re);
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
        int n = Integer.valueOf(in.readLine());
        String[] sp = in.readLine().split(" ");
        TreeSet<Integer> set = new TreeSet<>();

        int re = 0;

        for(int i = 0; i < n; i++)
        {
            int next = Integer.valueOf(sp[i]);
            set.add(next);
            if(set.first() >= next) re++;
        }

        System.out.println(re);
        
    }
    void b() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int a = Integer.valueOf(sp[0]),
            b = Integer.valueOf(sp[1]);
        String s1 = "", s2 = "";
        for(int i = 0; i < a; i++) s1 += "" + b;
        for(int i = 0; i < b; i++) s2 += "" + a;
        if(s1.compareTo(s2) < 0) System.out.println(s1);
        else System.out.println(s2);
    }

    void a() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            m = Integer.valueOf(sp[1]);
        if(m >= n) System.out.println("Yes");
        else System.out.println("No");
    }
}