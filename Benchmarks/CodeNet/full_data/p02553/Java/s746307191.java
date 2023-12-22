import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int a[]=new int[4],i; long max=Long.MIN_VALUE;
        for(i=0;i<4;i++)
        a[i]=Integer.parseInt(s[i]);
        for(i=0;i<2;i++)
        for(int j=2;j<4;j++)
        {
            long cur=1l*a[i]*a[j];
            max=Math.max(max,cur);
        }
        System.out.print(max);
    }
}
