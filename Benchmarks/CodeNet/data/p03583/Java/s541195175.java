import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static String solve(Scanner scanner) {
        long N = Integer.parseInt(scanner.nextLine());

        for (long n = 3500; n >= 1; n --) {
            for (long w = 3500; w >= 1; w --) {
                long denom = 4 * n * w - N * w - N * n;
                long numer = N * n * w;

                if (denom > 0 && numer % denom == 0) {
//                    System.out.println(denom);
//                    System.out.println(numer);

                    long h = numer / denom;
                    return n + " " + w + " " + h;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
//        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner));
    }

    private static String[] testCases = {
            "2",
            "3485",
            "4664"
    };

    private static void tests() {
        for (String t: testCases) {
            System.out.println(solve(new Scanner(testCaseToInputStream(t))));
        }
    }

    private static ByteArrayInputStream testCaseToInputStream(String ex) {
        try {
            return new ByteArrayInputStream(ex.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static int[] lineToIntNums(String line) {
        String[] numStrs = line.split(" ");
        int[] nums = new int[numStrs.length];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        return nums;
    }
}
