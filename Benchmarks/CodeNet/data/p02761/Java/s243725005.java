import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean b = false;
        int answer = 0;
        if (n == m) {
            int[] ans = new int[n];
            for (int i = 0; i < m; i++) {
                int s = sc.nextInt();
                int c = sc.nextInt();
                ans[s - 1] = c;
            }
            for (int i = n - 1, j = 1; i >= 0; i--, j*=10) {
                answer += ans[i] * j;
            }
            if (ans[0] != 0) {
                b = true;
            }
        }

        if (b) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
