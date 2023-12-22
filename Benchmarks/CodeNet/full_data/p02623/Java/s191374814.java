import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] sumA = new long[n+1];
        long[] sumB = new long[m+1];
        for (int i = 0; i < n; i++) {
            sumA[i+1] = sumA[i] + sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            sumB[i+1] = sumB[i] + sc.nextLong();
        }

        int max = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                long tmp = sumA[i] + sumB[j];
                if (tmp > k) break;
                max = Math.max(max, i+j);
            }
        }
        System.out.println(max);
    }
}
