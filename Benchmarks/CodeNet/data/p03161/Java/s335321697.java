import java.io.*;
import java.util.*;
public class Main {
    
    static int solve(int[] arr, int k, int s, HashMap<Integer, Integer> map) {
        if(s >= arr.length) 
            return 0;
        
        if(map.containsKey(s))
            return map.get(s);
        
        int sum = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++) {
            sum = Math.min(sum, solve(arr, k, s + i, map) + Math.abs(arr[s] - arr[s + i]));
        }
        
        map.put(s, sum);
        return sum;
    }
    
    public static void main(String args[]) {
        int n = 0, k = 0;
        int[] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            
            arr = new int[n];
            for (int i=0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }
        int[] dp = new int[n];
        dp[1] = Math.abs(arr[1] - arr[0]);
        for(int i = 2; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= k ; j++) {
                if(i - j >= 0)
                    dp[i] = Math.min(dp[i - j] + Math.abs(arr[i] - arr[i - j]), dp[i]);
            }
        }
        
        System.out.println(dp[n - 1]);
    }
}