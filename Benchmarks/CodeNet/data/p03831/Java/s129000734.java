import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long ans = 0;
        for (int i = 1; i < n; i++) {
            long dis = array[i] - array[i-1];
            if (dis * a < b) {
                ans += dis * a;
            } else {
                ans += b;
            }
        }
        
        System.out.println(ans);
    }
}