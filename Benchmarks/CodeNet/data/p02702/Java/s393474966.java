import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        long ret = 0;
        BigInteger m = new BigInteger("2019");
        for (int j = 0; j <= text.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (j - i <= 3) continue;
                if ( new BigInteger(text.substring(i,j)).mod(m).compareTo(BigInteger.ZERO) == 0) {
                    ret++;
                }
            }
        }
        System.out.println(ret);
    }
}