import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int i,c=0,n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),a[]=new int[n+1];
        for(i=0;i<k;i++)
        {
            int d=Integer.parseInt(bu.readLine()),j;
            s=bu.readLine().split(" ");
            for(j=0;j<d;j++)
                a[Integer.parseInt(s[j])]++;
        }
        for(i=1;i<=n;i++)
            if(a[i]==0) c++;
        System.out.print(c);
    }
}
