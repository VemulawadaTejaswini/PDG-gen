import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s[]=br.readLine().split(" ");
        int k=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        s=br.readLine().split(" ");
        int arr[]=new int[n];
        int ind=n-1;
        boolean b=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
            if(b&&arr[i]>=k/2)
            {
                ind=i;
                b=false;
            }
        }
        long dist=0;
        for(int i=1;i<n;i++)
        dist+=(long)(arr[i]-arr[i-1]);
        //pw.println(dist);
        long dist2=Long.MAX_VALUE;
        if(!b)
        {
            dist2=0;
            for(int i=ind-1;i>0;i--)
            {
                dist2+=(arr[i]-arr[i-1]);
               
            }
            dist2+=(long)Math.abs(k-arr[n-1]+arr[0]);
            for(int i=n-1;i>ind;i--)
            {
                dist2+=(long)(arr[i]-arr[i-1]);
               
            }
        }
       // pw.println(dist2);
        pw.println(Math.min(dist,dist2));
        pw.flush();
        pw.close();
    }
}