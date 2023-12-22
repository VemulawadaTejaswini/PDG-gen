
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long K = scanner.nextLong();
        long[] A = new long[N];
        long[] B = new long[M];

        for (int i = 0 ; i < N ; i++) {
            A[i] = scanner.nextLong();
        }

        for (int i = 0 ; i < M ; i++) {
            B[i] = scanner.nextLong();
        }

        long totalTime = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (totalTime <= K && (i < N || j < M)) {
            if (i >= N && j < M) {
                totalTime += B[j];
                j++;
                count++;
            } else if (i < N && j >= M) {
                totalTime += A[i];
                i++;
                count++;
            } else if (A[i] <= B[j]) {
                totalTime += A[i];
                i++;
                count++;
            } else {
                totalTime += B[j];
                j++;
                count++;
            }
        }

        if (totalTime > K) {
            count--;
        }
        System.out.println(count);
    }
}
