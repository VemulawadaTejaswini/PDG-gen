import java.util.*;

public class Main {
    public static int[] arr;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        arr = new int[300];
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            
            System.out.println(coinChange(17, N));
        }
    }
    
    public static int coinChange(int sz, int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (sz <= 0 && n >= 1) return 0;
        return coinChange(sz-1, n) + coinChange(sz, n - sz * sz);
    }
}


