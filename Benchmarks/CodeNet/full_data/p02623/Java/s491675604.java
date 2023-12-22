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

        if (sumA[n] + sumB[m] <= k) {
            System.out.println(n + m);
            return;
        }

        int max = 0;
        int tmpA = n;
        while (sumA[tmpA] > k) {
            tmpA--;
        }
        int tmpB = m;
        while (sumB[tmpB] > k) {
            tmpB--;
        }

        for (int i = tmpA; i >= 0; i--) {
            for (int j = tmpB; j >= 0; j--) {
                long tmp = sumA[i] + sumB[j];
                if (tmp > k) break;
                max = Math.max(max, i+j);
            }
        }
        System.out.println(max);
    }
}
