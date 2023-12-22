import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            boolean[] numbers = new boolean[n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                int counter = 0;
                while (counter < m) {
                    index =  (index + 1) % n;
                    if (!numbers[index]) {
                        counter++;
                    }
                }
                numbers[index] = true;
            }
            if (index == 0) {
                index = n;
            }
            System.out.println(index);
        }
    }

    public static void main(String... args) {
        solve();
    }
}