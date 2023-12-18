import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(n).append("\n");
        for (int i = 2; i < n; i++) {
            int ans = 0;
            if (y - x >= i) {
                ans += y - 1 - 1 - i + 1;
                ans += n - (x + 1) - i + 1;
            } else {
                ans += Math.max(0, x - 1 - i);
                ans += Math.max(0, n - y - i);
            }
            ans += Math.min(n, y - 1 + i) - Math.max(1, x + 1 - i) - i;
            if (y - x - (i - 1) >= i) {
                ans += i;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}