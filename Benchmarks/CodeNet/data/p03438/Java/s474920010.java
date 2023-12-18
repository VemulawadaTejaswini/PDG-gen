import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] sub = new int[n];
        int sum_sub = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            sub[i] = a[i] - b[i];
            sum_sub += sub[i];
        }

        if (sum_sub > 0) {
            System.out.println("No");
            return;
        } else if (sum_sub == 0) {
            System.out.println("Yes");
        } else {
            int now = 0;

            while (sub[n - 1] != 0) {
                sum_sub = 0;
                if (sub[now] == 0) {
                    now++;
                    if (now == n) {
                        now--;
                    }
                }
                if (sub[now] > 0) {
                    sub[now]--;
                    if (now == n - 1) {
                        sub[now] += 2;
                    } else {
                        sub[now + 1] += 2;
                    }
                } else if (sub[now] < 0) {
                    sub[now] += 2;
                    if (now == n - 1) {
                        sub[now]--;
                    } else {
                        sub[now + 1]--;
                    }
                }

                for (int i = now; i < n; i++) {
                    sum_sub += sub[i];
                }
                if (sum_sub > 0) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}