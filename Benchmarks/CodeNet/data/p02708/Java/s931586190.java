import java.util.*;

public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long[] min = new long[n+1];
        min[0] = 0;
        for (int i = 1; i < n+1; i++) {
            min[i] += min[i-1] + i;
        }
        // System.out.println(Arrays.toString(min));
        
        long[] max = new long[n+1];
        max[0] = n;
        for (int i = 1; i < n+1; i++) {
            max[i] += max[i-1] + n-i;
        }
        // System.out.println(Arrays.toString(max));
        
        long ans = 0;
        for (int i = k-1; i < n+1; i++) {
            ans += max[i] - min[i] + 1;
            ans %= MOD;
            // System.out.println(ans);
        }
        System.out.println(ans);
        
        
    }
}
