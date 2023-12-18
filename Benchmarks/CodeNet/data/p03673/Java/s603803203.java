import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ns = new long[n];
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextLong();
        }
        int end = n - 1, start = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                ans[start++] = ns[n-i];
            }
            else {
                ans[end--] = ns[n-i];
            }
        }
        System.out.printf("%d", ans[0]);
        for (int i = 1; i < n; i++) {
            System.out.printf(" %d", ans[i]);
        }
        System.out.println();
    }
}
