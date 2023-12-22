import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                a[sc.nextInt() - 1]++;
            }
        }
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                ans++;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}