

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int x = a[n - i - 1];

                if (i % 2 == 0) {
                    ans[i / 2] = x;
                } else {
                    ans[n - i / 2 - 1] = x;
                }
            }

            for (int i = 0; i < n; i++) {
                if (i != 0) {
                    System.out.print(" ");
                }
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}
