import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    static TreeMap<Long,Integer> tm = new TreeMap<>();
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        long base = 1;
        for(int i=0;i<=31;i++){
            tm.put(base,i);
            base *= i<31?4:1;
        }
        long[] rev = new long[n];
        for(int i=0;i<n;i++) rev[i] = a[n-1-i];
        long[] right = help(a), left = help(rev);
        long ans = 2*right[0];
        for(int i=1;i<n;i++){
            long cur = 2*(right[i]+left[n-i])+i;
            ans = Math.min(ans,cur);
        }
        ans = Math.min(ans,2*left[0]+n);
        System.out.println(ans);

    }
    static long[] help(long[] A){
        int n = A.length;
        long[][] dp = new long[n][16];
        for(int j=0;j<16;j++) dp[n-1][j]=j;
        for(int i=n-2;i>=0;i--){
            int dt = 0;
            long a = A[i],b=A[i+1];
            if(A[i]>A[i+1]){
                while(4*b<a) {
                    a *= 4;
                    dt++;
                }
                dt++;
            }else if(A[i]<A[i+1]){
                while(a<=b){
                    dt--;
                    a *= 4;
                }
                dt++;
            }
            for(int j=0;j<16;j++){
                int t = j+dt;
                if(t<15) dp[i][j] = j+dp[i+1][Math.max(t,0)];
                else dp[i][j] = j+dp[i+1][15]+(t-15)*(n-i-1);
            }
        }
        long[] ans = new long[n];
        for(int i=0;i<n;i++) ans[i] = dp[i][0];
        return ans;
    }
}
