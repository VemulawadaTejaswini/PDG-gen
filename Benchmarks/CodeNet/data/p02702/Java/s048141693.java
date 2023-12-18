import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static BigInteger Y2019 = new BigInteger("2019");

    static Set<String> checked = new HashSet<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int left = 0;
        int right = 4;

        long count = 0;
        BigInteger tmp;
        while (left <= S.length() - 4 && right <= S.length()) {

            String substring = S.substring(left, right);
            if (!checked.contains(substring)) {
                tmp = new BigInteger(substring);
                if (tmp.mod(Y2019).compareTo(BigInteger.ZERO) == 0) {
                    count += getCount(S, 0, substring);
                }
                checked.add(substring);
            }

            right++;
            if (right > S.length()) {
                left++;
                right = left + 4;
            }
        }
        System.out.println(count);
    }

    private static long getCount(String s, int fromIndex, String word) {
        long count = 0;
        int nextIndex = s.indexOf(word, fromIndex);
        if (nextIndex >= 0) {
            count++;
            count += getCount(s.substring(nextIndex + 1), nextIndex + 1, word);
        }
        return count;
    }
}
