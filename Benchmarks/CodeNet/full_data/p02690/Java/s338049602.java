import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(bu.readLine()),i,j,a=0,b=0;
        int f1=0,f2=0;
        for(i=0;i<=70;i++)
        {
            for(j=0;j<=i;j++)
                if((long)(Math.pow(i,5)-Math.pow(j,5))==n) {a=i; b=j; f1=1; break;}
                else if((long)(Math.pow(i,5)+Math.pow(j,5))==n) {a=i; b=j; f2=1; break;}
            if(f1==1 || f2==1) break;
        }
        if(f2==1) b=-b;
        System.out.print(a+" "+b);
    }
}
