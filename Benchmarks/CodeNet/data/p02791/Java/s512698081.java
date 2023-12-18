import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Main {

    private static int longestIncreasing(int[] nums) {
        int[] results = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = binarySearch(results, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            results[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            nums[i] = sc.nextInt();
        }

        System.out.println(longestIncreasing(nums));
    }

}