import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            int v = sc.nextInt();
            map.put(k,v);
        }
        int[] dp = new int[h+1];
        Arrays.fill(dp,900000000);
        dp[0] = 0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();
            for(int i = 0; i < h; i++){
                int ni = Math.min(h,i+k); //next-i
                dp[ni] = Math.min(dp[ni], dp[i] + v);
            }
        }
        System.out.println(dp[h]);
    }
}