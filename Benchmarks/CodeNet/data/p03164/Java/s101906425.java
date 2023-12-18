/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static long memo[][];
    static int w[];
    static int v[];
    static int n;
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int W=sc.nextInt();
       w=new int[n];
       v=new int[n];
       for(int i=0;i<n;i++)
       {
           w[i]=sc.nextInt();
           v[i]=sc.nextInt();
       }
       memo=new long[n][W+1];
       for(int i=0;i<n;i++)Arrays.fill(memo[i],-1);
       long ans=solve(0,W);
       System.out.println(ans);
       
   }
   public static long solve(int i,int W)
   {
       if(W<0)return Long.MIN_VALUE;
       if(i==n)return 0;
       if(W==0)return 0;
       
       if(memo[i][W]!=-1)return memo[i][W];
       return memo[i][W]=Math.max(solve(i+1,W),solve(i+1,W-w[i])+v[i]);
   }
}