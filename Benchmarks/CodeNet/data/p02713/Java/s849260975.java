import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.Comparator.*;


public class Main {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
//        int t=s.nextInt();
////        StringBuilder ans=new StringBuilder();
//        while(t-->0) {
            int n=s.nextInt();
            StringBuilder ans=new StringBuilder();
            int count=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    for(int k=1;k<=n;k++)
                    {
                        count+=gcd(gcd(i,j),k);
                    }
                }
            }
            System.out.println(count);

//        }
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