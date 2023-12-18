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

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    long choose(int n, int a)
    {
        long nf = 1;
        for(int i = 1; i <= a; i++)
        {
            nf *= i;
            nf %= mod;
            nf *= pow(i, mod - 2);
            nf %= mod;
        }
        return nf;
    }

    long pow(int a, int pow)
    {
        return pow(0L + a, pow);
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

    int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
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

    void c() throws Exception
    {
        int n = readInt();
        int[][] heights = new int[n][];
        int hmin = 0;

        for(int i = 0; i < n; i++)
        {
            heights[i] = toIntArray();
            hmin = Math.max(hmin, heights[i][2]);
        }

        for(int h = hmin; h <= hmin + 200; h++)
        {   
            for(int x = 0; x <= 100; x++)
            {
                for(int y = 0; y <= 100; y++)
                {

                    boolean flag = true;
                    for(int[] p : heights)
                    {
                        int dx = x - p[0], dy = y - p[1], hi = p[2];
                        if(Math.max(h - Math.abs(dx) - Math.abs(dy), 0) != hi)
                            flag = false;
                    }
                    if(flag)
                    {
                        out.printf("%d %d %d\n", x, y, h);
                        return;
                    }
                }
            }
        }
        out.println("-1");
    }
    
}
