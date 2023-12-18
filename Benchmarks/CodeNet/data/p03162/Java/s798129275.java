import java.io.*;
import java.util.*;
public class Main {
    
    static int solve(int[][] arr, int i, int a, HashMap<String, Integer> map) {
        if(i >= arr.length)
            return 0;
            
        String key = i + "," + a;
        if(map.containsKey(key))
            return map.get(key);
        
        int sum = 0;
        for(int ac = 0; ac < 3; ac++) {
            if(ac != a) {
                sum = Math.max(sum, solve(arr, i + 1, ac, map) + arr[i][ac]);
            }
        }
        
        map.put(key, sum);
        return sum;
    }
    
    public static void main(String args[]) {
        int n = 0, k = 0;
        int[][] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            
            arr = new int[n][3];
            for (int i=0; i < n; i++) {
                for(int j = 0; j < 3 ; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
        }
        
        System.out.println(solve(arr, 0, -1, new HashMap()));
        
    }
}