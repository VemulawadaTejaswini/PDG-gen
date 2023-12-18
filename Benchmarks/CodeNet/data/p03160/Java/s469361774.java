import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        //  System.out.println("Hello World!");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] ar=new int[n];
        for (int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        int ans=go(ar,0,dp);


        System.out.println(ans);
    }
    static int go(int[] ar,int i,int[] dp){
        if (i==ar.length-1){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int jump1=Integer.MAX_VALUE,jump2=Integer.MAX_VALUE;
        if (i+1<ar.length){
            jump1=Math.abs(ar[i]-ar[i+1])+go(ar,i+1,dp);
        }
        if (i+2<ar.length){
            jump2=Math.abs(ar[i]-ar[i+2])+go(ar,i+2,dp);
        }
        return dp[i]=Math.min(jump1,jump2);
    }
}