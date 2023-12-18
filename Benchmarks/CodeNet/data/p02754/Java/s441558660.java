import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger a_blue = new BigInteger(sc.next()); // 青
        BigInteger b_red = new BigInteger(sc.next()); // 赤
        BigInteger absum = a_blue.add(b_red); // 青と赤の合計
        BigInteger answer = n.divide(absum).multiply(a_blue);
        answer.add(n.remainder(absum));
        System.out.println(answer);
        sc.close();
    }
}
