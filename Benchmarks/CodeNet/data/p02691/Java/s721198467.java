import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > n) {
                continue;
            }
            for (int j = i + a[i] + 1; j < n; j++) {
                if (a[i] + a[j] == j - i) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }
}