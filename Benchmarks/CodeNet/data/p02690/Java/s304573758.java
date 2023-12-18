import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(bu.readLine()),i,j,a=0,b=0,max=(long)Math.pow(n,1.0/5);
        int f1=0,f2=0;
        for(i=-max;i<=max;i++)
        {
            for(j=-max;j<=max;j++)
            {
                long val=(long)Math.pow(i,5),val2=n+(long)Math.pow(j,5);
                if(val==val2) {a=i; b=j; f1=1; break;}
            }
            if(f1==1 || f2==1) break;
        }
        System.out.print(a+" "+b);
    }
}
