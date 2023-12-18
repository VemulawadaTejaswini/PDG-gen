import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=ob.nextInt();
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(a[1]-a[0]);
        if(n>=2)
        dp[2]=Math.min(Math.abs(a[2]-a[1])+dp[1],Math.abs(a[2]-a[0])+dp[0]);
        
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(dp));
        
        for(int i=3;i<n;i++)
        dp[i]=Math.min(dp[i-2]+Math.abs(a[i-2]-a[i]),dp[i-1]+Math.abs(a[i]-a[i-1]));
        System.out.println(dp[n-1]);
        
        //System.out.println(Arrays.toString(dp));
        //System.out.println("Hello World!");
    }
}
