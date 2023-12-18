import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        for (double i = 1; i <= 3500; i++) {
            for (double j = 1; j <= 3500; j++) {
                if ((4 - n / i - n / j) != 0 && n / (4 - n / i - n / j) % 1 == 0 && n / (4 - n / i - n / j) > 0) {
                    System.out.println((int)i + " " + (int)j + " " + (int)(n / (4 - n / i - n / j)));
                    return;
                }
            }
        }
    }
}