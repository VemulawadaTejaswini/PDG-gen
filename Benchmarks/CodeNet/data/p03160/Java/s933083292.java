import java.util.*;
public class Main {
    public static long mini(int a[],int n)
    {
       int dp[]=new int[n];
       dp[0]=0;
       dp[1]=Math.abs(a[1]-a[0]);
       for(int i=2;i<n;i++)
       {
           dp[i]=Math.min(Math.abs(a[i]-a[i-2])+dp[i-2],Math.abs(a[i]-a[i-1])+dp[i-1]);
       }
       return dp[n-1];
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(mini(a,n));
    }
}