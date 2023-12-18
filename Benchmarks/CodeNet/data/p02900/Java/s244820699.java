import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        List<Long> commonDivisor = new ArrayList<>();
        long min = A > B ? B : A;
        for (long i = 1; i <= min; i++) {
            if (A % i == 0 && B % i == 0) {
                commonDivisor.add(i);
            }
        }

        long result = 0;

        for (long x = 0; x < commonDivisor.size(); x++) {
            boolean isOk = true;
            for (long y = 0; y < commonDivisor.size(); y++) {
                if (x == y) {
                    continue;
                }

                if(!tagainiso(commonDivisor.get(x), commonDivisor.get(y))) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean tagainiso(long a, long b) {
        long min = a > b ? b : a;

        for (long i = 2; i < min; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }

        return true;
    }
}
