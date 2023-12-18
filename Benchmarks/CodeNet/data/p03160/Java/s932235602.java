/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author arvin
 */
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int a[]=new int[n];
        long dp[]=new long[n+5];
        String abc[]=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)
           a[i]=Integer.parseInt(abc[i]);
        
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            if(i+2==n)
                dp[i]=Math.min(dp[i+1]+Math.abs(a[i]-a[i+1]),dp[i+2]+Math.abs(a[i]-a[i+1]));
            else
                dp[i]=Math.min(dp[i+1]+Math.abs(a[i]-a[i+1]),dp[i+2]+Math.abs(a[i]-a[i+2]));
        }
        System.out.println(dp[0]);
    }
}
