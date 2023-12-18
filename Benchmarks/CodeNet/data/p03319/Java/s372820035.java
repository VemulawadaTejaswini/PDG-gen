

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

            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans++;
                for (int j = 0; j < k; j++)
                    i++;
                i--;
                if ( i >= n - 1 ) {
                    break;
                } else {
                    i--;
                }
            }
            System.out.println(ans);
        }
    }
}
