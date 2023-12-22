
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int g = 0;
        int x = 0;
        int y = 0;
        while (n != 0) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int s = 0; s < n; s++) {
                g = g + a[s];
            }
            x = g / n;
            for (int s = 0; s < n; s++) {
                if (a[s] <= x) {
                    y = y + 1;
                }
            }
            System.out.println(y);
            n = scanner.nextInt();
            g = 0;
            x = 0;
            y = 0;
        }
    }
}

