import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = 5;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
