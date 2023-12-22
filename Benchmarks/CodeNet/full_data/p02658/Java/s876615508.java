import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.*;
public class Main {
    public static long num[] = new long[1023];
    public static int k=0;
    public static void main(String args[])throws IOException
    {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        int n = (int)in.nval;
        long sum=1,temp=0;
        boolean dui = false;
        long m=1000000000;
        for(int i=0;i<n;i++)
        {
            in.nextToken();
            long a = (long)in.nval;
            temp = sum;
            if(a==0)
            {
                sum=0;
            }
            else
            {
                sum*=a;
            }
          if(temp*a!=sum)
            dui = true;
        }
            if(dui==true||sum>m*m)
                out.println(-1);
            else
                out.println(sum);
        out.flush();
    }
                  }