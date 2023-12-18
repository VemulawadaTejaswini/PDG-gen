import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] atk = new int[n];
        int[] mgc = new int[n];
        //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            atk[i] = sc.nextInt();
            mgc[i] = sc.nextInt();
            //map.put(k,v);
        }
        long[] dp = new long[h+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= h; i++){
            //for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            for(int j = 0; j < n; j++){
                int k = atk[j];
                int v = mgc[j];
                if(i < k){
                    dp[i] = Math.min(dp[i], v);
                }else{
                    dp[i] = Math.min(dp[i], dp[i-k] + v);
                }
            }
        }
        System.out.println(dp[h]);
    }
}