import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static boolean isValid(int n, Set<Integer> valid) {
        while (n > 0) {
            if (!valid.contains(n % 10)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            Set<Integer> valid = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            for (int i = 0; i < K; i++) {
                valid.remove(sc.nextInt());
            }
            for (int i = N; i < 10000; i++) {
                if (isValid(i, valid)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}