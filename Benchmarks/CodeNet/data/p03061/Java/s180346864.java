import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final Integer[] values = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        if (values.length == 2) {
            System.out.println(Math.max(values[0], values[1]));
            return;
        }

        int maxGcd = 1;
        for (int i = 0; i < values.length; i++) {
            maxGcd = Math.max(gcd(values, i), maxGcd);
        }

        System.out.println(maxGcd);
    }

    private static int gcd(Integer[] values, int excl) {
        int[] nums = new int[values.length - 1];

        int j = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == excl) {
                continue;
            }

            nums[j] = values[i];
            j++;
        }

        int gcd = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            gcd = gcd(gcd, nums[i + 1]);
        }

        return gcd;
    }

    private static int gcd(int a, int b) {
        if (a == b) return a;
        if (a < b) return gcd(b, a);
        if (a % b == 0) return b;

        return gcd(b, (a % b));
    }
}

