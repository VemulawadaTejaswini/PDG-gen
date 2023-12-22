import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        double l = 1, r = 1000000007;
        while (r - l > 0.001) {
            double mid = l + (r - l) / 2.0;
            boolean check = check(nums, k, mid);
            if (check) {
                r = mid;
            } else {
                l = mid + 0.001;
            }
        }
        System.out.println(Math.round(l));
    }

    private static boolean check(double[] nums, int k, double mid) {
        int req = 0;
        for (double num : nums) {
            if (num > mid) {
                req += (int) (num / mid);
            }
        }
        return req <= k;
    }
}