import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static String solve(Scanner scanner) {
        boolean ret = solveInner(scanner);
        return ret ? "Yes" : "No";
    }

    private static boolean solveInner(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int[] nums = lineTointNums(scanner.nextLine());

        int n4 = 0;
        int nOdds = 0;
        for (int num : nums) {
            if (num == 0) continue;
            if (num % 2 == 1) {
                nOdds++;
            } else if (num % 4 == 0) {
                n4++;
            }
        }

        if (nOdds > n4) return nOdds + n4 == N && nOdds == n4 + 1;
        return true;    
    }

    public static void main(String[] args) {
//        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner));
    }

    private static String ex1 = "3\n" +
            "1 10 100";
    private static String ex2 = "4\n" +
            "1 2 3 4";
    private static String ex3 = "3\n" +
            "1 4 1";
    private static String ex4 = "2\n" +
            "1 1";
    private static String ex5 = "6\n" +
            "2 7 1 8 2 8";

    private static void tests() {
        System.out.println(solve(new Scanner(testCaseToInputStream(ex1))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex2))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex3))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex4))));
        System.out.println(solve(new Scanner(testCaseToInputStream(ex5))));
    }

    private static ByteArrayInputStream testCaseToInputStream(String ex) {
        try {
            return new ByteArrayInputStream(ex.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static int[] lineTointNums(String line) {
        String[] numStrs = line.split(" ");
        int[] nums = new int[numStrs.length];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        return nums;
    }
}
