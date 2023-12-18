import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static int capacity;
    static long wei[];
    static long val[];
    static HashMap<Integer,HashMap<Long,Long>> dp=new HashMap<>(); //dp[n][capacity];
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        capacity=input.nextInt();
        wei=new long[n];
        val=new long[n];
        for(int i=0;i<n;i++) {
            dp.put(i, new HashMap<Long,Long>());
            wei[i]=input.nextInt();
            val[i]=input.nextInt();
        }
        System.out.println(solve(n-1,capacity));
    }
    public static long solve(int n,long cap) {
        if(n==-1 || cap==0) {
            return 0;
        }
        if(!dp.get(n).containsKey(cap)) {
            long tmp=Integer.MIN_VALUE;
            if(cap>=wei[n]) {
                tmp=Math.max(tmp, solve(n-1,cap-wei[n])+val[n]);
            }
            tmp=Math.max(tmp, solve(n-1,cap));
            dp.get(n).put(cap, tmp);
        }
        return dp.get(n).get(cap);
    }
}
