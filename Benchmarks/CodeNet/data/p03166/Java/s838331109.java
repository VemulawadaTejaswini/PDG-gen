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
    
    static ArrayList<Integer> a[];
    static int b[];
    static long dp[];
    
    static long dfs(int x)
    {
        //if(x==4)
          //  System.out.print("s");
        long val=0l;
        for(int k=0;k<a[x].size();k++)
        {
            long ch;
            if(dp[a[x].get(k)]==0)
                ch=dfs(a[x].get(k));
            else
                ch=dp[a[x].get(k)];
            //dp[a[x].get(k)]=ch+1;
            val=Math.max(ch,val);
        }
        dp[x]=val+1;
        return dp[x];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        a=new ArrayList[n+1];
        b=new int[n+1];
        dp=new long[n+1];
        for(int i=0;i<=n;i++)
            a[i]=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[x].add(y);
            b[y]=1;
        }
        long ans=0l;
        for(int i=1;i<=n;i++)
            if(b[i]==0)
                ans=Math.max(dfs(i),ans);
        System.out.println(ans-1);
        /*for(int i=0;i<=n;i++)
            System.out.print(dp[i]+" ");
        System.out.print("\n");
        for(int i=0;i<=n;i++)
            System.out.print(b[i]+" ");*/
        sc.close();
    }
}
