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
            if(map.containsKey(k)){
                int pv = map.get(v);
                map.put(k,Math.max(v,pv));
            }else{
                map.put(k,v);
            }
        }
        int[] dp = new int[h+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= h; i++){
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                int k = entry.getKey();
                int v = entry.getValue();
                int p = Math.max(0,i-k); //prev
                dp[i] = Math.min(dp[i], dp[p] + v);
            }
        }
        System.out.println(dp[h]);
    }
}