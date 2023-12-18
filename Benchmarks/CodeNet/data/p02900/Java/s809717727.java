import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ABC142D {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            List<Long> primeFactor = new ArrayList<>();
            Long target = gcd(a, b);
            for (Long i = 2L; i < target; i++) {
                if (target % i == 0) {
                    primeFactor.add(i);
                    target /= i;
                    i = 2L;
                }
            }
            primeFactor.add(target);

            System.out.println(new HashSet<>(primeFactor).size() + 1);
        }
    }

    // 最大公約数を返す
    public static Long gcd(Long a, Long b) {
        Long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
