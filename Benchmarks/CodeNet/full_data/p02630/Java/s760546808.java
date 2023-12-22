import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),a[]=new int[n],i,c[]=new int[100001],k;
        long sum=0;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        {
            k=Integer.parseInt(s[i]);
            c[k]++;
            sum+=k;
        }
        int q=Integer.parseInt(bu.readLine());
        while(q-->0)
        {
            s=bu.readLine().split(" ");
            int l=Integer.parseInt(s[0]),r=Integer.parseInt(s[1]);
            sum-=1l*c[l]*l;
            sum+=1l*c[l]*r;
            c[r]+=c[l];
            c[l]=0;
            sb.append(sum+"\n");
        }
        System.out.print(sb);
    }
}
