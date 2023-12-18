import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cap = scan.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];

        for(int i = 0 ; i < n ; i++) {
            weights[i] = scan.nextInt();
            values[i] = scan.nextInt();
        }
        // first approach = top-down 
        //System.out.println(helper(0, weights, values, cap, new HashMap<Integer, Map<Integer, Long>>()));
        // second approach = bottom-up.
        // we build the weights table and find out if we are including the new item or not. 
        long[][] dp = new long[n+1][cap+1];
        for(int index = 0 ; index <= n ; index++) {
            // Row signifies set of all the elements until this row index. 
            for(int weight = 0 ; weight <= cap ; weight++) {
                // column signifies for the current weight index what is the optimal packing.
                if(index == 0 || weight == 0){
                    dp[index][weight] = 0;
                } else {
                    //Not including this item for this weight = dp[index-1][weight]
                    //Including this item for this weight = values[index-1]+dp[index-1][weight-weights[index-1]]
                    long notIncluding = dp[index-1][weight];
                    long including = (weight >= weights[index-1]) ? values[index-1]+dp[index-1][weight-weights[index-1]] : 0;
                    dp[index][weight] = Math.max(notIncluding, including);
                }
            }
            System.out.println(Arrays.toString(dp[index]));
        }
        System.out.println(dp[n][cap]);
    }

    private static long helper(int index, int[] weights, int[] values, int cap, Map<Integer, Map<Integer, Long>> cache){
        long pick = 0;
        if(cache.containsKey(index) && cache.get(index).containsKey(cap)) return cache.get(index).get(cap);
        if(cap < 0) return 0;
        if(index == weights.length) return 0;
        if(cap >= weights[index]){
            pick = values[index]+helper(index+1, weights, values, cap-weights[index], cache);
        }
        long nopick = helper(index+1, weights, values, cap, cache);
        cache.putIfAbsent(index, new HashMap<>());
        long max = Math.max(pick, nopick);
        cache.get(index).put(cap, max);
        return max;
    }
}
