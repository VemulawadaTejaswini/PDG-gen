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

        // char[] c = new char[4];
        // c[1] = '.';
        // for(char i = '0'; i <= '9'; i++)
        // {
        //     for(char j = '0'; j <= '9'; j++)
        //     {
        //         for(char k = '0'; k <= '9'; k++)
        //         {
        //             c[0] = i;
        //             c[2] = j;
        //             c[3] = k;
        //             double d = Double.valueOf(String.valueOf(c));
        //             int v = (int)(d * 100);
        //             String s1 = String.valueOf("" + c[0] + c[2] + c[3]),
        //                 s2 = String.valueOf(v);
        //             System.out.printf("%s %s %b\n", s1, s2, s1.equals(s2));
        //         }
        //     }
        // }


        new Main().a();
        out.flush();
    }

    void e() throws Exception
    {
        int n = readInt();
        long[] a = new long[n], b = new long[n];
        for(int i = 0; i < n; i++)
        {
            long[] ary = toLongArray();    
            a[i] = ary[0];
            b[i] = ary[1];
        }
        
        long re = n;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] * a[j] + b[i] * b[j] != 0) re++;
            }
        }
        System.out.println(re);
        
    }

    void d() throws Exception
    {
        long n = Long.valueOf(in.readLine());
        int step = 0;
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i < sqrt; i++)
        {
            if(n % i == 0)
            {
                // System.out.printf("...%d\n", i);
                int counter = 0;
                while(n % i == 0)
                {
                    n /= i;
                    counter++;
                }
                // System.out.printf("%d %d\n", i, counter);
                step += count(counter);
            }
        }
        if(n > 1) step++;
        
        System.out.println(step);
    }

    int count(int k)
    {
        int sum = 0, cur = 0;
        while(sum + cur <= k)
        {
            sum += cur;
            cur++;
        }
        return cur - 1;
    }


    void c() throws Exception
    {
        String[] str = split();
        double a = Double.valueOf(str[0]), b = Double.valueOf(str[1]);
        long first = (long) a;
        int mul = (int) (b * 100);
        System.out.printf("%d %d\n", first, mul);
        long sum = first * mul / 100;
        System.out.println(sum);
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int n = readInt();
        long cap = 1_000_000_000_000_000_000L;
        long[] ary = toLongArray();
        Arrays.sort(ary);
        if(ary[0] == 0)
        {
            System.out.println(0);
            return;
        }
        long prod = 1L;
        for(int i = 0; i < n; i++)
        {
            if(ary[i] > cap / prod)
            {
                System.out.println(-1);
                return;
            }
            prod *= ary[i];
        }    
        System.out.println(prod);
        
    }

    void a() throws Exception
    {
        String str = in.readLine();
        char c = str.charAt(0);
        if('a' <= c && c <= 'z') out.println('a');
        else out.println('A');
    }
}