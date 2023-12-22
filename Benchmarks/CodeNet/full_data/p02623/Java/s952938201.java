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

        int tmpA = n;
        while (sumA[tmpA] > k) {
            tmpA--;
        }
        int tmpB = m;
        while (sumB[tmpB] > k) {
            tmpB--;
        }

        int max= 0;
        for (int i = tmpA; i >= 0; i--) {
            for (int j = 0; j <= tmpB && i + j > max; j++) {
                if (sumA[i] + sumB[j] > k) continue;
                max = i+j;
                break;
            }
        }
        System.out.println(max);
    }
}