import java.util.*;

class Main {
    public static int maxx(int a, int b, int c)
{
    return Math.max(Math.max(a,b),c);
}
    public static void main(String args[] ) throws Exception {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int INF = (int)1e9+7;
        int a[]=new int[n];
        int dp[][]=new int[n][3];
        int a1,b,c;
        for(int i=0;i<n;i++)
        {
            a1=ob.nextInt();b=ob.nextInt();c=ob.nextInt();
            if(i==0)
            {
                dp[i][0]=a1;dp[i][1]=b;dp[i][2]=c;
            }
            else
            {
                dp[i][0]=Math.max(dp[i-1][1]+a1,dp[i-1][2]+a1);
                dp[i][1]=Math.max(dp[i-1][0]+b,dp[i-1][2]+b);
                dp[i][2]=Math.max(dp[i-1][1]+c,dp[i-1][0]+c);
            }
        }
        
       
        System.out.println(maxx(dp[n-1][0],dp[n-1][1],dp[n-1][2]));
        
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(dp));
        
        
        
        //System.out.println(Arrays.toString(dp));
        //System.out.println("Hello World!");
    }
}
