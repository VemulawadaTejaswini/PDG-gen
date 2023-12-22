
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (max < (i * 10)) {
                flag = 1;
            }
            if (a[i] + (10 * i) > max) {
                max = a[i] + (10 * i);
            }

        }
        max = 0;
        for (int i = 0; i < n; i++) {
            if (max < (i * 10)) {
                flag = 1;
            }
            if (a[n - 1 - i] + (10 * i) > max) {
                max = a[n - 1 - i] + (10 * i);
            }

        }
        if (flag == 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

    }
}

