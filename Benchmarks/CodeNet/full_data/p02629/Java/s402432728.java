/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner input=new Scanner(System.in);
      long n=input.nextLong();
       long[] a=new long[n];
       long sum=0;
       for(long i=0;i<n;i++)
       {
            a[i]=input.nextLong();
            sum+=a[i];
        }
        Map<Long,Long> map=new HashMap<Long,Long>();
        for(long i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                long x=map.get(a[i]);
                x++;
                map.put(a[i],x);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        long q=input.nextInt();
        while(q-->0)
        {
            long b=input.nextInt();
            long c=input.nextInt();
            // int x=map.get(b);
            if(map.containsKey(b))
            {
                long x=map.get(b);
            sum=sum-(x*b);
            sum=sum+(x*c);
            System.out.println(sum);
            if(map.containsKey(c))
            {
                long y=map.get(c);
                map.put(c,(x+y));
            }
            else
            {
                map.put(c,x);
            }
            }
            else{
                System.out.println(sum);
            }
        }
        input.close();
	}
}