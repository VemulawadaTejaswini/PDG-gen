import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        if (a[0] > k && b[0] > k) {
            System.out.println("0");
            return;
        }
        int ans = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        while (true) {
            if (i == n && j == m) {
                break;
            }
            if (i == n && j < m) {
                if (sum + b[j] <= k) {
                    sum += b[j];
                    j++;
                    ans++;
                } else {
                    break;
                }
                continue;
            }
            if (j == m && i < n) {
                if (sum + a[i] <= k) {
                    sum += a[i];
                    i++;
                    ans++;
                } else {
                    break;
                }
                continue;
            }
            if (a[i] < b[j]) {
                if (sum + a[i] <= k) {
                    sum += a[i];
                    i++;
                    ans++;
                } else {
                    break;
                }
            } else if (b[j] < a[i]) {
                if (sum + b[j] <= k) {
                    sum += b[j];
                    j++;
                    ans++;
                } else {
                    break;
                }
            } else {
                int na = (i + 1 < n) ? a[i + 1] : Integer.MAX_VALUE;
                int nb = (j + 1 < m) ? b[j + 1] : Integer.MAX_VALUE;
                if (na < nb) {
                    if (sum + b[j] <= k) {
                        sum += b[j];
                        j++;
                        ans++;
                    }
                } else {
                    if (sum + b[j] <= k) {
                        sum += b[j];
                        j++;
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
