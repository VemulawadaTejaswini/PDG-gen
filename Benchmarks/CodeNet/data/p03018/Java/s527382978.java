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
        // System.out.println((-100 + 0) / 2);

        new Main().b();
        out.flush();
    }
    
    void b() throws Exception
    {
        String str = in.readLine();
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++)
        {
            char c = str.charAt(i);
            if(c == 'B' && i + 1 < n && str.charAt(i + 1) == 'C')
            {
                sb.append("D");
                i++;
            }
            else 
            {
                sb.append(c);
            }
        }

        str = sb.toString();

        // System.out.println(str);

        int i = 0;
        n = str.length();
        int op = 0;

        while(i < n)
        {
            int j = i;
            int countA = 0;
            while(j < n && (str.charAt(j) == 'A' || str.charAt(j) == 'D'))
            {
                if(str.charAt(j) == 'A') countA++;
                else op += countA;
                j++;
            }
            // now str[j] = B or C or ending
            i = j + 1;
        }
        System.out.println(op);
    }

}
