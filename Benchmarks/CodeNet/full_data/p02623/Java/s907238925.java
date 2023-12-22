import java.util.Scanner;

public class  Main {
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
        sc.close();

        int indexA = n;
        while (sumA[indexA] > k) {
            indexA--;
        }

        int indexB = 0;
        int max = 0;
        while (indexA >= 0 && indexB <= m) {
            long cur = sumA[indexA] + sumB[indexB];
            while (cur < k && indexB < m) {
                cur = sumA[indexA] + sumB[++indexB];
            }
            int res = indexA + indexB;
            if (cur > k) {
                res--;
            }
            max = Math.max(res, max);
            indexA--;

        }

        System.out.println(max);
    }
}