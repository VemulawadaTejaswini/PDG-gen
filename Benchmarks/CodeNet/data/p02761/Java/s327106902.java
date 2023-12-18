import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if (s == 1 && c == 0) {
                System.out.println(-1);
                return;
            } else if (num[s - 1] > -1 && num[s - 1] != c) {
                System.out.println(-1);
                return;
            } else {
                num[s - 1] = c;
            }
        }
        int ans = 0, digit = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (num[i] != -1) ans += num[i] * digit;
            digit *= 10;
        }
        System.out.println(ans < 0? -1: ans);
    }
}
