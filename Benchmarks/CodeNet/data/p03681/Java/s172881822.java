import java.util.*;
import java.io.*;

class Main{
    static long MOD=1_000_000_007;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(), m=sc.nextLong();
        sc.close();
        System.out.println(solve(n, m));
    }
    public static long solve(long n, long m){
        if(m>n) return solve(m, n);
        if(n>=m+2) return 0;
        long ans=1l;
        for(long i=1;i<=m;i++){
            ans*=i;
            ans%=MOD;
            ans*=i;
            ans%=MOD;
        }
        if(n!=m) ans*=n;
        else ans*=2;
        ans%=MOD;
        return ans;
    }
}
