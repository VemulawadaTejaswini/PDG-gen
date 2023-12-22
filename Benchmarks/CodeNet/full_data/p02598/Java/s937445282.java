import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long k=in.nextLong();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            max=Math.max(max,arr[i]);
        long low=1;
        long high=max;
        long curr=max;
        while(low<=high)
        {
            long mid=(low+high)/2;
            long sum=0;
            for(int i=0;i<n;i++)
            {
                if(((arr[i]-mid)%mid)==0)
                    sum+=(arr[i]-mid)/mid;
                else
                    sum+=1+(arr[i]-mid)/mid;
            }
            if(sum<=k)
            {
                high=mid-1;
                curr=mid;
            }
            else
                low=mid+1;
        }
        long sum=0;
        /*for(int i=0;i<n;i++)
        {
            if(((arr[i]-292638192)%292638192)==0)
                sum+=(arr[i]-292638192)/292638192;
            else
                sum+=(1+(arr[i]-292638192)/292638192);
        }*/
        System.out.println(curr);
    }
}