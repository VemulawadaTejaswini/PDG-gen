

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < n; ++i) {
            int score = scanner.nextInt();
            if (score <= a) {
                ++num1;
            }
            else if (score >= a + 1 && score <= b) {
                 ++num2;
            } else {
                ++num3;
            }
        }
        System.out.println(Math.min(num1, Math.min(num2, num3)));

    }
}
