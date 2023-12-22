import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        String str = in.next();
        char[] s = str.toCharArray();
        int counter = 0, size = s.length;

        if (s.length > 4) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 4; j < size; j++) {
                    BigInteger b;
                    if (j + 1 == size) b = new BigInteger(str.substring(i));
                    else b = new BigInteger(str.substring(i, j));
                    if (b.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO) &&
                            b.mod(BigInteger.valueOf(673)).equals(BigInteger.ZERO)) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    // 1 817 181 712 114
}