import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        long a = nums[0];
        long b;
        for (int i = 1; i < n; i++) {
            b = nums[i];
            long large = Math.max(a, b);
            long small = Math.min(a, b);
            a = lcm(large, small);
        }
        System.out.println(a);
    }

     static long gcd(long large, long small) {
        long r = large % small;
        while(r != 0) {
            large = small;
            small = r;
            r = large % small;
        }
        return small;
     }

     static long lcm(long large, long small) {
        long gcd = gcd(large, small);
        return large / gcd * small;
     }
}
