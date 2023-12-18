import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            HashSet<Integer> primeFactor = new HashSet<>();
            Long target = gcd(a, b);
            for (int i = 3; i <= target; i += 2) {
                if (target % i == 0) {
                    primeFactor.add(i);
                    target /= i;
                    i = 3;
                }
            }

            System.out.println(primeFactor.size() + (target % 2 == 0 ? 2 : 1));
        }
    }

    // 最大公約数を返す
    public static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
