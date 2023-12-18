import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            List<Integer> commonDivisor = new ArrayList<>();
            int max = a < b ? b : a;
            for (int i = 1; i <= max; i++) {
                if (a % i == 0 && b % i == 0) {
                    commonDivisor.add(i);
                }
            }

            List<Integer> primeFactor = new ArrayList<>();
            int target = commonDivisor.get(commonDivisor.size() - 1);
            for (int i = 2; i < target; i++) {
                if (target % i == 0) {
                    primeFactor.add(i);
                    target = target / i;
                    i = 2;
                }
            }
            primeFactor.add(target);

            System.out.println(new HashSet<>(primeFactor).size() + 1);
        }
    }
}
