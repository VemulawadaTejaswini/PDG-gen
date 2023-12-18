import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().split("")[0]);
        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long max = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (i == k) {
                    continue;
                }

                if (i > k) {
                    continue;
                }

                long g = gcd(nums[i], nums[k]);
                if (max == g) {
                    break;
                }

                if (max < g) {
                    max = g;
                }
            }
        }
        System.out.println(max);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
