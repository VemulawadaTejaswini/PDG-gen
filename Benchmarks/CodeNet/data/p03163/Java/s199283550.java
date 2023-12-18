import java.io.*;
import java.util.*;
public class Main {
    
    static long solve(int[][] arr, int w, int s, int cw, HashMap<String, Long> map) {
        
        if(s >= arr.length || cw + arr[s][0] > w)
            return 0;
        String key = s +","+cw;
        
        // System.out.println(key + " " + arr[s][0] + " " + w);
        
        if(map.containsKey(key))
            return map.get(key);
        
        long sum = solve(arr, w, s + 1, cw, map);
        if(cw + arr[s][0] <= w)
            sum = Math.max(sum, solve(arr, w, s + 1, cw + arr[s][0], map) + arr[s][1]);
        
        map.put(key, sum);
        return sum;
    }
    
    public static void main(String args[]) {
        int n = 0, w = 0;
        int[][] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            w = scanner.nextInt();
            
            arr = new int[n][2];
            for (int i=0; i < n; i++) {
                for(int j = 0; j < 2 ; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
        }
        
        HashMap<String, Long> map = new HashMap();
        long ret = solve(arr, w, 0, 0, map);
        // System.out.println(map);
        System.out.println(ret);
        
    }
}