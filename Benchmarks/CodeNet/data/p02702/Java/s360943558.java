import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static BigInteger Y2019 = new BigInteger("2019");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        BigInteger maxNumber = new BigInteger(S);
        BigInteger divided = maxNumber.divide(Y2019);

        long count = 0;
        long i = 1;
        BigInteger tmp = Y2019;
        while (true) {
            String tmpString = tmp.toString();
            if (!tmpString.contains("0")) {
                count += getCount(S, 0, tmpString);
            }
            tmp = Y2019.multiply(new BigInteger(String.valueOf(++i)));
            if (tmp.compareTo(divided) >= 0) {
                System.out.println(count);
                return;
            }
        }
    }

    private static long getCount(String s, int fromIndex, String word) {
        long count = 0;
        int nextIndex = s.indexOf(word, fromIndex);
        if (nextIndex >= 0) {
//            System.out.println(word + "... " + fromIndex + "," + nextIndex);
            count++;
            count += getCount(s.substring(nextIndex + 1), nextIndex + 1, word);
        }
        return count;
    }
}