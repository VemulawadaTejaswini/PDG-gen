import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;

public class Main {
    private static final int MAXN = 100001;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        var data = new Long[201];

        for (int i = -100; i <= 100; ++i) {
            data[i + 100] = (long)Math.pow(i, 5);
        }

        for (int i = 0; i < 200; ++i) {
            for (int j = 0; j < 200; ++j) {
                if (data[i] - data[j] == x) {
                    System.out.printf("%d %d\n", i - 100, j - 100);
                    return;
                }
            }
        }
    }
}
