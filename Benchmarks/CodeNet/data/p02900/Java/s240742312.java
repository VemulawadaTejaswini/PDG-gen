import java.util.HashSet;
import java.util.Scanner;

public class Aim {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            int gcd = getGcd(a, b);
            HashSet<Integer> primeFactor = new HashSet<>();
            for (int i = 3; i <= gcd; i += 2) {
                if (gcd % i == 0) {
                    primeFactor.add(i);
                    gcd /= i;
                    i = 3;
                }
            }

            System.out.println(primeFactor);
            System.out.println(primeFactor.size() + (gcd % 2 == 0 ? 2 : 1));
        }
    }

    // 最大公約数を返す
    public static int getGcd(long a, Long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return Integer.parseInt(b.toString());
    }
}
