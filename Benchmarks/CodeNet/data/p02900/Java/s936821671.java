import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> commonDivisor = new ArrayList<>();
        int min = A > B ? B : A;
        for (int i = 1; i <= min; i++) {
            if (A % i == 0 && B % i == 0) {
                commonDivisor.add(i);
            }
        }

        int result = 0;

        for (int x = 0; x < commonDivisor.size(); x++) {
            boolean isOk = true;
            for (int y = 0; y < commonDivisor.size(); y++) {
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

    public static boolean tagainiso(int a, int b) {
        int min = a > b ? b : a;

        for (int i = 2; i < min; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }

        return true;
    }
}
