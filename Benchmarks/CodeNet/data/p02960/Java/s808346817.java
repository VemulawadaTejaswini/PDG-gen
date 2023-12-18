
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pattern = scanner.next();


        int[][] memo = new int[pattern.length()][13];

        System.out.println(run(pattern, 0, BigInteger.TEN.pow(pattern.length() - 1), 5, memo));
    }

    private static int modValue = (int) (Math.pow(10, 9) + 7);

    private static int run(String pattern, int i, BigInteger multiplier, int rem, int[][] memo) {
        if (i == pattern.length()) {
            return rem == 0 ? 1 : 0;
        }

        if (memo[i][rem] != 0) {
            return Math.max(0, memo[i][rem]);
        }

        int d = Character.getNumericValue(pattern.charAt(i));
        int sum = 0;
        if (d == -1) { // '?' case
            for (int j = 0; j <= 9; j++) {
                BigInteger b = multiplier.multiply(BigInteger.valueOf(j));
                int actualRem = b.mod(BigInteger.valueOf(13)).intValue();
                int newRem = rem - actualRem;
                if (newRem < 0) newRem += 13;
                sum += run(pattern, i + 1, multiplier.divide(BigInteger.TEN), newRem, memo);
                sum = sum % modValue;
            }
        } else {
            BigInteger b = multiplier.multiply(BigInteger.valueOf(d));
            int actualRem = b.mod(BigInteger.valueOf(13)).intValue();
            int newRem = rem - actualRem;
            if (newRem < 0) newRem += 13;
            sum += run(pattern, i + 1, multiplier.divide(BigInteger.TEN), newRem, memo);
            sum = sum % modValue;
        }

        if (sum == 0) {
            memo[i][rem] = -1;
        } else {
            memo[i][rem] = sum;
        }

        return sum;
    }
}
