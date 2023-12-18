import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static int solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int[] nums = lineTointNums(scanner.nextLine());

        HashMap<Integer, Integer> numCounts = new HashMap<>();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
            int count = numCounts.get(num);

            if (num >= max1 && count == 4) {
                max1 = num;
                max2 = num;
            } else if (num > max1 && count == 2) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && count == 2) {
                max2 = num;
            }
        }

        if (max1 == Integer.MIN_VALUE || max2 == Integer.MIN_VALUE) return 0;

        return max1 * max2;
    }

    private static int[] lineTointNums(String line) {
        String[] numStrs = line.split(" ");
        int[] nums = new int[numStrs.length];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        //tests();

        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner));
    }

    private static String ex1 = "6\n" +
            "3 1 2 4 2 1";
    private static String ex2 = "4\n" +
            "1 2 3 4";
    private static String ex3 = "10\n" +
            "3 3 3 3 4 4 4 5 5 5";

    private static void tests() {
        System.out.println(solve(new Scanner(testCaseToInputStream(ex1))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex2))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex3))));
    }

    private static ByteArrayInputStream testCaseToInputStream(String ex) {
        try {
            return new ByteArrayInputStream(ex.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
