import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int size = s.length();
        int count = 0;
        BigInteger mod = new BigInteger("2019");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size + 1; j++) {
                BigInteger num = new BigInteger(s.substring(i, j));
                if (num.remainder(mod).equals(BigInteger.ZERO)) {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
