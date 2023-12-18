/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author arvin
 */
public class Main {
    
    static int val[],weight[],dp[][];
    
    static int rec(int x,int w)
    {
        if(w<=0)
            return 0;
        if(x<0)
            return 0;
        int a1=0,a2;
        if(weight[x]<=w)
        {
            if(x>0 && dp[x-1][w-weight[x]]!=0)
                a1=val[x]+dp[x-1][w-weight[x]];
            else
                a1=val[x]+rec(x-1,w-weight[x]);
        }
        if(x>0 && dp[x-1][w]!=0)
            a2=dp[x-1][w];
        else
            a2=rec(x-1,w);
        dp[x][w]=Math.max(a1,a2);
        return dp[x][w];
    }
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        val=new int[n];
        weight=new int[n];
        for(int i=0;i<n;i++)
        {
          val[i]=sc.nextInt();
          weight[i]=sc.nextInt();
        }
        dp=new int[n+1][w+1];
        

        int ans=rec(n-1,w);
        
        System.out.println(ans);
        
        sc.close();
    }
}
