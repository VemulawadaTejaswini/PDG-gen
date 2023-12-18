import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        sc.close();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int A = Math.abs(0 - x[i]);
            int B = Math.abs(k - x[i]);

            if (A < B) {
                ans += A * 2;
            } else {
                ans += B * 2;
            }
        }

        System.out.println(ans);
    }
}