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

        new Main().d();

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
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]);
        int[] ary = new int[n];
        sp = in.readLine().split(" ");    
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        Arrays.sort(ary);
        // 
        long[] f = new long[n + 10];
        f[k - 1] = 1;

        int mod = 1_000_000_007;
        
        for(int i = k; i <= n; i++)
        {
            f[i] = (f[i - 1] * i / (i - k + 1)) % mod;
        }

        long sum = 0;

        for(int i = 0; i < n; i++)
        {
            long right = f[n - 1 - i];
            long left = f[i];
            // System.out.printf("%d %d %d\n", right, left, ary[i]);
            // sum %= mod;
            sum = (sum -right * ary[i]) % mod;
            sum = (sum + left * ary[i]) % mod;
            // sum += left * ary[i];
            // System.out.println(sum);
        }

        System.out.println(sum % mod);
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