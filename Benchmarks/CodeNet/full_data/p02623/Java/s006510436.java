
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

        int a = 0;
        int b = 0;
        long totalTime = 0;
        long count = 0;
        while (true) {
            if (a == N && b == M) {
                break;
            }

            if (a == N) {
                if (totalTime + B[b] <= K) {
                    totalTime += B[b];
                    count++;
                    b++;
                } else {
                    break;
                }
            } else if (b == M) {
                if (totalTime + A[a] <= K) {
                    totalTime += A[a];
                    count++;
                    a++;
                } else {
                    break;
                }
            } else if (A[a] < B[b]) {
                if (totalTime + A[a] <= K) {
                    totalTime += A[a];
                    count++;
                    a++;
                } else {
                    break;
                }
            } else {
                if (totalTime + B[b] <= K) {
                    totalTime += B[b];
                    count++;
                    b++;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }

}
