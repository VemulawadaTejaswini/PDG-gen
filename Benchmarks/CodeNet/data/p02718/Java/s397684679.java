import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.Comparator.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
        int n=s.nextInt();
        int m=s.nextInt();
        int[] arr=new int[n];
        double sum=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
//        Arrays.sort(arr);
        sum/=(4*m);
//        System.out.println(sum);
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=sum)
            {
                count++;
            }
        }
        if(count>=m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
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