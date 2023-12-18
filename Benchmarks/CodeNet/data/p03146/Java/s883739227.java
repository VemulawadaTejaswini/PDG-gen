import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.next());
        scanner.close();

        HashSet<Integer> set = new HashSet<>();
        set.add(s);

        for (int i = 2; i <= 1000001; i++) {
            s = f(s);

            if (!set.add(s)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static int f(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }
}

