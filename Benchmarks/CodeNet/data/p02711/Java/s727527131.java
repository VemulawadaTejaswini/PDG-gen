import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.Comparator.*;


public class Main {
    static int findDiv(int n)
    {
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return Math.max(i,n/i);
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
        int t=s.nextInt();
//        StringBuilder ans=new StringBuilder();
        while(t-->0) {
            String str=s.next();
            int flag=0;

            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='7')
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }

        }
    }

}


class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
//3
//2 1 3
//3 3 6
//99995 9998900021 999890031