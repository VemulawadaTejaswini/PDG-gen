import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(bu.readLine());
        long p=100,t=0;
        while(p<n)
        {
            p=(long)Math.floor(1.0*p*(101.0/100));
            t++;
        }
        System.out.print(t);
    }
}
