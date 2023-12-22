import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        sc.nextLine();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumB = 0;
        for(int i=0; i<m; i++) {
            sumB += b[i];
        }

        long atime = 0;
        int max_count = 0;
        for (int i = -1; i < n; i++) {
            if (i >= 0) {
                if (atime + sumB < k) continue;
                if (atime + a[i] > k) {
                    if (max_count < i) max_count = i;
                    break;
                } else atime += a[i];
            }

            long btime = atime;
            for (int j = 0; j < m; j++) {
                if (btime + b[j] > k) {
                    if (max_count < i + 1 + j) max_count = i + 1 + j;
                    break;
                } else {
                    btime += b[j];

                    if (i + 1 == n && j + 1 == m) max_count = m + n;
                }
            }
        }

        System.out.println(max_count);
    }
}