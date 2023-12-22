import java.io.PrintWriter;
import java.util.*;

public class Main{
    static PrintWriter out;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out=new PrintWriter(System.out);

        int sum=sc.nextInt();
        dp=new Long[sum+1];
        out.println(f(sum));

        sc.close();
        out.close();
    }
    static  long mod=1000000007;
    static long mul(long a,long b){
        a%=mod;
        b%=mod;
        return (a*b)%mod;
    }
    static long sub(long a,long b){
        a%=mod;
        b%=mod;
        return ((a-b)%mod+mod)%mod;
    }
    static long add(long a,long b){
        a%=mod;
        b%=mod;
        return (a+b)%mod;
    }

    static Long dp[];
    static long f(int sum){
        if(dp[sum]!=null){
            return dp[sum];
        }
        if(sum==0){
            return dp[sum]=1l;
        }
        long ans=0;
        for (int i = 3; i <=sum ; i++) {
            ans=add(ans,f(sum-i));
        }
        return dp[sum]=ans;
    }




}