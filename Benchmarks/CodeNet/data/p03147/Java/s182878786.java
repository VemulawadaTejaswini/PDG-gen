import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int cnt = 0;
        while (true) {
            int l = n;
            int r = n-1;

            for (int i = 0; i < n; i++) {
                if (h[i] > 0) {
                    l = Math.min(l, i);
                } else if (l < i) {
                    r = i-1;
                    break;
                }
            }

            if (l == n)
                break;

            int min = 110;
            for (int i = l; i <= r; i++) {
                min = Math.min(min, h[i]);
            }
            for (int i = l; i <= r; i++) {
                h[i] -= min;
            }
            cnt += min;
        }

        System.out.println(cnt);
    }
}
