/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int[] a=new int[n];
       long sum=0;
       for(int i=0;i<n;i++)
       {
            a[i]=input.nextInt();
            sum+=(long)a[i];
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                int x=map.get(a[i]);
                x++;
                map.put(a[i],x);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        int q=input.nextInt();
        while(q-->0)
        {
            int b=input.nextInt();
            int c=input.nextInt();
            int x=map.get(b);
            sum=sum-(long)(x*b);
            sum=sum+(long)(x*c);
            System.out.println(sum);
            if(map.containsKey(c))
            {
                int y=map.get(c);
                map.put(c,(x+y));
            }
            else
            {
                map.put(c,x);
            }
        }
        input.close();
	}
}