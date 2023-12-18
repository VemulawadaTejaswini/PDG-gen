import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] sub = new int[n];
        int sum_a = 0, sum_b = 0;
        int num;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum_a += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
            sum_b += b[i];
            sub[i] = a[i] - b[i];
        }

        lim = sum_b - sum_a;

        if (lim < 0) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (sub[i] > 0) {
                ans += sub[i];
            }
        }

        if (ans > num) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}