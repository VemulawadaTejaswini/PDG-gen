import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int size = s.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean flag = true;
            for (int j = i + 1; j < size + 1; j++) {
                if ((j - i) >=  Math.pow(10, 19) ) {
                    flag =false;
                }
                if (flag) {
                    long num = Long.parseLong(s.substring(i, j));
                    if (num % 2019 == 0) {
                        count ++;
                    }
                } else {
                    BigInteger num = new BigInteger(s.substring(i, j));
                    if (num.remainder(new BigInteger("2019")).equals(BigInteger.ZERO)) {
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
