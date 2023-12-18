import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                long xLength = x[j] - x[i];
                long yLength = y[j] - y[i];
                
                Set<Long> set = new HashSet<Long>();
                
                for (int k = 0; k < n; k++) {
                    long value = yLength * x[k] - xLength * y[k];
                    set.add(value);
                }
                
                min = Math.min(min, set.size());
            }
        }
        
        System.out.println(min);
    }
}