import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[4];

        int m = n;
        for (int i = 3; i >= 0; i--) {
            a[i] = m % 10;
            m /= 10;
        }

        int sign = 0;
        for (int i = 0; i < 8; i++) {
            int calc = a[0];
            for (int j = 1; j < 4; j++) {
                calc += (((i >> (j - 1)) & 1) == 0 ? +a[j] : -a[j]);

            }

            if (calc == 7) {
                sign = i;
                break;
            }
        }

        System.out.print(a[0]);
        for (int i = 1; i < 4; i++) {
            if (((sign >> (i - 1)) & 1) == 0) {
                System.out.print('+');
            } else {
                System.out.print('-');
            }
            System.out.print(a[i]);
        }
        System.out.println("=7");
    }
}