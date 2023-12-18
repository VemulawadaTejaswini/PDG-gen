import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static int capacity;
    static int wei[];
    static int val[];
    static HashMap<Integer,HashMap<Integer,Integer>> dp=new HashMap<>(); //dp[n][capacity];
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        capacity=input.nextInt();
        wei=new int[n];
        val=new int[n];
        for(int i=0;i<n;i++) {
            dp.put(i, new HashMap<Integer,Integer>());
            wei[i]=input.nextInt();
            val[i]=input.nextInt();
        }
        System.out.println(solve(n-1,capacity));
    }
    public static int solve(int n,int cap) {
        if(n==-1 || cap==0) {
            return 0;
        }
        if(!dp.get(n).containsKey(cap)) {
            int tmp=Integer.MIN_VALUE;
            if(cap>=wei[n]) {
                tmp=Math.max(tmp, solve(n-1,cap-wei[n])+val[n]);
            }
            tmp=Math.max(tmp, solve(n-1,cap));
            dp.get(n).put(cap, tmp);
        }
        return dp.get(n).get(cap);
    }
}
