import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int x = scanner.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int pos = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (pos <= x) {
                ans++;
            }
            pos = pos + a[i];
        }
        System.out.println(ans);
    }
}
