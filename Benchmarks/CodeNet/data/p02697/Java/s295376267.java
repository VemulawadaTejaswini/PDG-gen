
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n % 2 == 1) {
            int a = 1;
            int b = n;
            for (int i = 0; i < m; ++i) {
                System.out.println(a + " " + b);
                a++;
                b--;
            }
        } else {
            int aOdd = 1;
            int bOdd = n;
            int [] used = new int[n + 1];
            for (int i = 0; i < (m + 1) / 2; ++i) {
                System.out.println(aOdd + " " + bOdd);
                used[aOdd] = 1;
                used[bOdd] = 1;
                aOdd++;
                bOdd--;
            }
            int aEven = 2;
            int bEven = n;
            while (used[aEven] == 1 || used[bEven] == 1) {
                aEven++;
                bEven--;
            }
            for (int i = 0; i < m - (m + 1) / 2; ++i) {
                System.out.println(aEven + " " + bEven);
                aEven++;
                bEven--;
            }
        }
    }
}
