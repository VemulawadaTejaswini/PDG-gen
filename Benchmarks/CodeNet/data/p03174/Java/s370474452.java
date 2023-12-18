import java.io.*;
import java.util.*;
public class Main {
    static long dfs(int[][] met, int m, int wmask, long[][] map) {
        if(m >= met.length) {
            return 1;
        }
        // String key = m + "" + wmask;
        if(map[m][wmask] != -1){
            // System.out.println("Key found " + map.get(key));
            return map[m][wmask];
            
        }
            
        int[] wo = met[m];
        long sum = 0;
        for(int w = 0; w < met.length; w++) {
            if(met[m][w] == 1 && (wmask & 1 << w) == 0) {
                sum = (sum + dfs(met, m+1, wmask | (1 << w), map))%MOD;
            }
        }
        
        map[m][wmask] = sum;
        return sum;
    }
    static long MOD = 1000*1000*1000 + 7;
    public static void main(String args[]) {
        int n = 0;
        
        int[][] met = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            met = new int[n][n];
            for(int i = 0; i < n ;i++) {
                for(int j = 0; j < n ;j++) {
                    met[i][j] = scanner.nextInt();
                }
            }
        }
        
        long[][] map = new long[n][1<<n];
        for(long[] m : map)
            Arrays.fill(m, -1);
        // HashMap<String, Long> map = new HashMap();
        long ret = dfs(met, 0, 0, map);
        
        // System.out.println(map);
        System.out.println(ret);
        
    }
    
}