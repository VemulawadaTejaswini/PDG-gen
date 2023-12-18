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
        if(test < 0) {String[] str = in.readLine().split(" ");}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        
        new Main().b();

        
        out.flush();
    }

    void b() throws Exception
    {
        String str = in.readLine();
        int n = str.length();
        String sub1 = str.substring(0, (n - 1) / 2);
        String sub2 = str.substring((n + 3) / 2 - 1, n);
        // System.out.println(sub1);
        // System.out.println(sub2);

        if(isPalin(str) && isPalin(sub1) && isPalin(sub2)) out.println("Yes");
        else out.println("No");
    }

    boolean isPalin(String str)
    {
        int i = 0, j = str.length() - 1;
        while(i < j && str.charAt(i) == str.charAt(j))
        {
            i++;
            j--;
        }
        return i >= j;
    }

    void a() throws Exception
    {
        int[] ary = toIntArray();
        int a = ary[0], b = ary[1];

        int re = a * (a - 1) / 2 + b * (b - 1) / 2;

        out.println(re);
    }
}