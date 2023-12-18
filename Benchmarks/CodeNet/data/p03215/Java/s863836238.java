import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        a[0] = sc.nextLong();
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }
        long b[] = new long[n * (n + 1)];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[(i + 1) * n + j] = a[j] - a[i];
            }
        }
        Arrays.sort(b);
        long c[][] = new long[n * (n + 1) / 2][10];
        for (int i = 0; i < n * (n + 1) / 2; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j] = b[n * (n + 1) - 1 - i] % 2;
                b[n * (n + 1) - 1 - i] /= 2;
            }
        }
        long sum[] = new long[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n * (n + 1) / 2; j++) {
                sum[i] += c[j][i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (sum[10 - i - 1] >= k) {
                for (int j = 0; j < n * (n + 1) / 2; j++) {
                    if (c[j][10 - i - 1] == 0) {
                        for (int l = 0; l < 10; l++) {
                            c[j][l] = 0;
                        }
                    }
                }
                for (int j = 0; j < 10; j++) {
                    sum[j] = 0;
                    for (int l = 0; l < n * (n + 1) / 2; l++) {
                        sum[j] += c[l][j];
                    }
                }
            }
        }
        int bit = 0;
        for (int i = 0; i < 10; i++) {
            if (sum[i] >= k) {
                bit += Math.pow(2, i);
            }
        }
        System.out.println(bit);

    }

}