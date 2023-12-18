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
    
    static int n,m,a[],dp[][];
    
    static public int rec(int x,int y)
    {
        if(n==1)
        {
            if((m&1)==0)
                return 2;
            else
                return 1;
        }
        if(x==0)
            return y^3;
        int p,flag=0;
        for(int i=0;i<n;i++)
        {
            if(x-a[i]>=0)
            {
                if(dp[x-a[i]][y^3]==0)
                    p=rec(x-a[i],y^3);
                else
                    p=dp[x-a[i]][y^3];
                if(p==y)
                {
                   flag=1;
                    break;
                }
            }
        }
        if(flag==1)
            dp[x][y]=y;
        else
            dp[x][y]=(y^3);
        return dp[x][y];
        
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n+2];
        dp=new int[m+5][5];
        sc.nextLine();
        String abc[]=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(abc[i]);
        
        dp[0][1]=2;
        dp[0][2]=1;
        int xy=rec(m,1);
        if(xy==1)
            System.out.println("First");
        else
            System.out.println("Second");
        sc.close();
    }
}
