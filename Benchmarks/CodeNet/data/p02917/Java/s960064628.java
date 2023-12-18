import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int ans = 0;

        for (int i = 0; i < n-1; i++) {
            b[i] = sc.nextInt();
        }

        ans += b[0];
        ans += b[n-2];

        for (int i = 1; i < n; i++) {
            ans += min(b[i], b[i - 1]);
        }

        System.out.println(ans);
    }
}