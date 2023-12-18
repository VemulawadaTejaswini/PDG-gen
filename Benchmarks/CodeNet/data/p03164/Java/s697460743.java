import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println(helper(0, weights, values, cap, new HashMap<String, Long>()));
    }
    private static long helper(int index, int[] weights, int[] values, int cap, Map<String, Long> cache){
        long pick = 0;
        String key = index+":"+cap;
        if(cache.containsKey(key)) return cache.get(key);
        if(cap < 0) return 0;
        if(index == weights.length) return 0;
        if(cap >= weights[index]){
            pick = values[index]+helper(index+1, weights, values, cap-weights[index], cache);
        }
        long nopick = helper(index+1, weights, values, cap, cache);
        cache.put(key, Math.max(pick, nopick));
        return cache.get(key);
    }
}