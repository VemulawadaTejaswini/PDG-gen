import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if (k % 2 == 0) {
            long count1 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == k / 2) count1++;
            }
            long count2 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == 0) count2++;
            }
            
            long ans = count1 * count1 * count1 + count2 * count2 * count2;
            System.out.println(ans);
        } else {
            long count2 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == 0) count2++;
            }
            
            long ans = count2 * count2 * count2;
            System.out.println(ans);
        }
    }
}