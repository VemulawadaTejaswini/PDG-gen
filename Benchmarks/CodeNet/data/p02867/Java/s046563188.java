import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (N % 2 == 0) {
            boolean cond1 = true;
            boolean cond2 = true;
            for (int i = 0; i < N; i++) {
                if (a[i] != b[(i + 1) % N]) {
                    cond1 = false;
                }
                if (a[(i + 1) % N] != b[i]) {
                    cond2 = false;
                }
            }
            if (cond1 || cond2) {
                System.out.println("No");
                return;
            }
        } else {
            for (int j = 1; j < N; j++) {
                boolean cond = true;
                for (int i = 0; i < N; i++) {
                    if (a[i] != b[(i + j) % N]) {
                        cond = false;
                    }
                }
                if (cond) {
                    System.out.println("No");
                    return;
                }
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < N; i++) {
            if (a[i] > b[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}