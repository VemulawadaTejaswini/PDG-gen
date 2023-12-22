import java.io.PrintWriter;
import java.util.*;

public class Main{
    static PrintWriter out;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out=new PrintWriter(System.out);


        int n=sc.nextInt();
        dp=new Long[n+1][2][2];
        out.println(f(0,n,0,0));


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

    static Long dp[][][];
    static long f(int i,int n,int f9,int f0){
        if(dp[i][f9][f0]!=null){
            return dp[i][f9][f0];
        }
        if(i==n){
            return dp[i][f9][f0]=(long)f0&f9;
        }
        long ans=0;

        ans=add(ans,f(i+1,n,f9,f0|1));

        ans=add(ans,f(i+1,n,f9|1,f0));

        ans=add(ans,mul(8,f(i+1,n,f9,f0)));


        return dp[i][f9][f0]=ans;
    }


}