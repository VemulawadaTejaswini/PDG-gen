
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pattern = scanner.next();

        int first = pattern.length() + 1;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) != '?') {
                first = i;
                break;
            }
        }

        int[][] memo = new int[pattern.length()][13];

        System.out.println(run(pattern, first, pattern.length() - 1, BigInteger.ONE, 5, memo));
    }

    private static int run(String pattern, int firstNumIndex, int i, BigInteger multiplier, int rem, int[][] memo) {
        if (i < 0) return 0;
        if (memo[i][rem] != 0) {
            return Math.max(0, memo[i][rem]);
        }

        int d = Character.getNumericValue(pattern.charAt(i));
        int sum = 0;
        if (d == -1) { // '?' case
            for (int j = 0; j <= 9; j++) {
                BigInteger b = multiplier.multiply(BigInteger.valueOf(j));
                int actualRem = b.mod(BigInteger.valueOf(13)).intValue();
                if (actualRem == rem && j != 0 && i <= firstNumIndex) sum += 1;
                int newRem = rem - actualRem;
                if (newRem < 0) newRem += 13;
                sum += run(pattern, firstNumIndex, i - 1, multiplier.multiply(BigInteger.TEN), newRem, memo);
                sum = (int) (sum % (Math.pow(10, 9) + 7));
            }
        } else {
            BigInteger b = multiplier.multiply(BigInteger.valueOf(d));
            int actualRem = b.mod(BigInteger.valueOf(13)).intValue();
            if (actualRem == rem && d != 0 && i <= firstNumIndex) sum += 1;
            int newRem = rem - actualRem;
            if (newRem < 0) newRem += 13;
            sum += run(pattern, firstNumIndex, i - 1, multiplier.multiply(BigInteger.TEN), newRem, memo);
        }

        if (sum == 0) {
            memo[i][rem] = -1;
        } else {
            sum = (int) (sum % (Math.pow(10, 9) + 7));
            memo[i][rem] = sum;
        }
        return sum;
    }
}
