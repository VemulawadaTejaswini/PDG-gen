/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author arvin
 */
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long c=sc.nextLong();
        sc.nextLine();
        int a[]=new int[n];
        long dp[]=new long[n+5];
        String abc[]=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)
           a[i]=Integer.parseInt(abc[i]);
        
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            long x=Long.MAX_VALUE;
            for(int j=1;i+j<n;j++)
                x=Math.min(dp[i+j]+(long)Math.pow(a[i+j]-a[i],2)+c,x);
            dp[i]=x;
        }
        System.out.println(dp[0]);
    }
}
