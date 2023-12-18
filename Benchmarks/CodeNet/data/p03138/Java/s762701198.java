import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int n;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long K = sc.nextLong();
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        long[] bitCount = new long[41];
        // for simplicity we write in 1-base.
        for(int i=1;i<=40;i++){
            long mask = 1L<<(i-1);
            for(long w:a) bitCount[i] += (mask&w)>0?1:0;
        }
        // dp[i]: if bit[1],bit[2],...,bit[i] can be chosen randomly. The biggest value
        long[] dp = new long[41];
        for(int i=1;i<=40;i++){
            long mask = 1L<<(i-1);
            dp[i] = dp[i-1]+Math.max(bitCount[i],n-bitCount[i])*mask;
        }
        long ans = 0;
        for(long w:a) ans += w^K; // basic result, with no change
        for(int i=40;i>=1;i--){
            long mask = 1L<<(i-1);
            if((mask&K)==0) continue;
            long submask = ~(mask-1), X = K^mask;
            long cur = 0;
            for(int j=0;j<n;j++) {
                long now = (a[j]^X)&submask;
                cur += now;
            }
            cur += dp[i-1];
            ans = Math.max(ans,cur);
        }
        System.out.println(ans);
    }
}
