import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        long x=Long.parseLong(str[0]);
        long pow5[]=new long[6201];
        for(int i=0;i<=6200;i++)
        pow5[i]=(long)Math.pow(i,5);
        int a=-1,b=10000;
        for(int i=0;i<=6200;i++)
        {
            a=i;
            b=10000;
            long rem=(long)Math.abs(pow5[i]-x);
            for(int j=0;j<=6200;j++)
            {
                if(pow5[j]==rem)
                {
                    b=-j;
                    break;
                }
            }
            if(b<0)
            break;
        }
        pw.println(a+" "+b);
        pw.flush();
        pw.close();
    }
}