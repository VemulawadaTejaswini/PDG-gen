import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if (k % 2 == 0) {
            int count1 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == k / 2) count1++;
            }
            int count2 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == 0) count2++;
            }
            
            long ans = (long)count1 * count1 * count1 + count2 * count2 * count2;
            System.out.println(ans);
        } else {
            int count2 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == 0) count2++;
            }
            
            long ans = (long)count2 * count2 * count2;
            System.out.println(ans);
        }
    }
}