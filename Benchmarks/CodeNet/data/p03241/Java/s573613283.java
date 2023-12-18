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

    int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

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

        new Main().d();
        out.flush();
    }

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], m = ary[1];
        int ans = 0;
        
        for(int i = 1; i <= Math.sqrt(m) + 1; i++)
        {
            if(m % i == 0)
            {
                int a = i, b = m / i;
                // System.out.printf("%d %d\n", a, b);
                if(n <= a) ans = Math.max(ans, b);
                if(n <= b) ans = Math.max(ans, a);
            }
        }


      	out.println(ans);
    }

    
}
