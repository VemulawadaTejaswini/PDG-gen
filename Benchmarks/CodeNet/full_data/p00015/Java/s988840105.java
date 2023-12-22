import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        BigInteger MAX = new BigInteger("10");
        MAX = MAX.pow(80);

        for (int i = 0; i < N; i++) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());

            System.out.println(((a.add(b)).compareTo(MAX) >= 0)? "overflow" : a.add(b));
        }
    }
}