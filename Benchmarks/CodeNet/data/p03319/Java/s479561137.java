

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int idx1 = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if ( a[i] == 1 ) {
                    idx1 = i;
                }
            }

            System.out.println(n / (k - 1));
        }
    }
}
