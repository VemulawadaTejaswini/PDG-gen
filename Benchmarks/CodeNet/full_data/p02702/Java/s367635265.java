import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        long ret = 0;
        BigInteger m = new BigInteger("2019");
        BigInteger zero = BigInteger.ZERO;
        for (int j = 0; j <= text.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (j - i <= 3) continue;
                if (j - i <= 18) {
                    if (Long.parseLong(text.substring(i,j)) % 2019 == 0) {
                        ret++;
                    }
                } else {
                    if (new BigInteger(text.substring(i, j)).mod(m).compareTo(zero) == 0) {
                        ret++;
                    }
                }
            }
        }
        System.out.println(ret);
    }
}