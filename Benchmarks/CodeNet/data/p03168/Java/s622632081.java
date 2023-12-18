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
 
    static double dp[][],a[];
    static int n;
    
    static double rec(int x,int y)
    {
        if((n&1)==1 && y>n/2)
            return 0.0;
         if((n&1)==0 && y>=n/2)
            return 0.0;
        if(x==n)
            return 1.0;
        if(dp[x][y]!=2.0)
            return dp[x][y];
        double ab,ch;
        if(dp[x+1][y]==2.0)
        {
            //System.out.print((x+1)+" "+y+" "+a[x]+" ");
            ab=a[x]*rec(x+1,y);
        }
        else
            ab=a[x]*dp[x+1][y];
        if(dp[x+1][y+1]==2.0)
            ch=(1-a[x])*rec(x+1,y+1);
        else
            ch=(1-a[x])*dp[x+1][y+1];
        dp[x][y]=ab+ch;
        //System.out.print(ab+" "+ch);
        return dp[x][y];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        dp=new double[n+1][n/2+5];
        a=new double[n];
        for(int i=0;i<=n;i++)
            Arrays.fill(dp[i],2.0);
        sc.nextLine();
        String abc[]=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)
            a[i]=Double.parseDouble(abc[i]);
        System.out.println(rec(0,0));
        
        sc.close();
    }
}
