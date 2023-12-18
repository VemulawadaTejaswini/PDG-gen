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
        s += s ;
        int k = sc.nextInt() ;

        char [] cur = s.toCharArray() ;
        int n = s.length();
        long cnt = 0;
        for(int i = 1 ; i < n ; i ++)
            if(cur[i] == cur[i - 1])
            {
                cnt++;
                cur[i] = '#' ;
            }
        long one = 0 ;
        cur = s.toCharArray() ;
        int check = 0 ;
        for(int i = 1 ; i < n / 2 ; i ++)
            if(cur[i] == cur[i - 1])
            {
                cur[i] = '#' ;
                one ++ ;
            }

        out.println(cnt * (k / 2) + (k % 2) * one + (cur[(n / 2) - 1] == cur[n / 2] ? 1 : 0));

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