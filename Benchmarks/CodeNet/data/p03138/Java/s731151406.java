import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int n;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[n];
        for(int i=0;i<n;i++) A[i]=sc.nextLong();
        long sum=0;
        for(long w:A) sum+=w;
        if(K==0){
            System.out.println(sum);
            return;
        }
        long[] dp = new long[42], bitCount = new long[42];
        for(int i=1;i<42;i++){
            long mask = (long)Math.pow(2,i-1);
            for(long w:A) bitCount[i] += (mask&w)>0?1:0;
            dp[i] = ((long)Math.max(bitCount[i],n-bitCount[i]))*mask+dp[i-1];
        }
        ArrayList<Integer> ones = new ArrayList<>();
        for(int i=0;i<42;i++){
            long mask = (long)Math.pow(2,i);
            if((mask&K)>0) ones.add(i+1);
        }
        long ans = help(ones.size()-1,ones,dp,bitCount,A);
        long res = 0;
        for(long w:A) res += w^K;
        System.out.println(Math.max(res,ans));
    }
    static long help(int idx, ArrayList<Integer> ones, long[] dp, long[] bitCount, long[] A){
        if(idx==0){
            long mask = 1L<<(ones.get(0)-1);
            long left = mask*(n-bitCount[ones.get(0)]);
            for(long w:A) left+= w&(mask-1);
            return Math.max(left,dp[ones.get(0)-1]+mask*bitCount[ones.get(0)]);
        }
        long mask = 1L<<(ones.get(idx)-1);
        long left = mask*(n-bitCount[ones.get(idx)]);
        long next = 1L<<(ones.get(idx-1)-1);
        for(int i=0;i<A.length;i++){
            long cur = A[i]&(~mask)&(~(next*2-1));
            left+=cur;
            A[i] = A[i]&(next*2-1);
        }
        return Math.max(left+help(idx-1,ones,dp,bitCount,A),dp[ones.get(idx)-1]+mask*bitCount[ones.get(idx)]);
    }
}