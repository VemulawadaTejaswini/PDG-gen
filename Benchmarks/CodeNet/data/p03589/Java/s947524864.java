
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= 3500; i++) {
            for (int j = i; j <= 3500; j++) {
                for (int k = j; k <= 3500;k++) {
                    if (4 * i * j * k == N * (i * j + i * k+ k * j)) {
                        System.out.print(i + " " + j + " " + k);
                        return;
                    }
                }
            }
        }

    }
}
