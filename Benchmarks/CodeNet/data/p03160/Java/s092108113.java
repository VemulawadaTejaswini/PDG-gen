import java.util.*;
public class Main
{
    static int n;
    static int dp[],m[];
    static int solve(int i)
    {
        if(i>n)
            return 2000000000;
        if(i==n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        dp[i]=Math.min(Math.abs(m[i]-m[i+1])+solve(i+1),Math.abs(m[i]-m[i+2])+solve(i+2));
        return dp[i];
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        dp=new int[n+5];
        m=new int[n+5];
        for(int i=1;i<=n;i++)
            m[i]=in.nextInt();
        Arrays.fill(dp,-1);
        System.out.println(solve(1));
        in.close();
    }
}
