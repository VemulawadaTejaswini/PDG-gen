import static java.lang.Math.*;
import static java.util.Arrays.* ;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main
{

    void main() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = sc.next();
        int n = s.length();

        int k = sc.nextInt() ;

        char [] cur = (s).toCharArray() ;
        long ans = 0 ;

        for(int i = 1 ; i < n ; i ++)
            if(cur[i] == cur[i - 1])
            {
                ans ++ ;
                cur[i] = '#' ;
            }

        long one = 0 ;
        cur = (s + s).toCharArray() ;

        for(int i = 1 ; i < cur.length ; i ++)
            if(cur[i] == cur[i - 1])
            {
                cur[i] = '#' ;
                if(i >= n) one ++ ;

            }
        ans += one * (k - 1) ;
        out.println(ans);
        out.flush();
        out.close();
    }

    class Scanner
    {
        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream in)
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws Exception
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        String nextLine() throws Exception
        {
            return br.readLine() ;
        }
        int nextInt() throws Exception { return Integer.parseInt(next()); }

        long nextLong() throws Exception { return Long.parseLong(next()); }

        double nextDouble() throws Exception { return Double.parseDouble(next());}
    }

    public static void main (String [] args) throws Exception
    {
        new Main().main();
    }

}