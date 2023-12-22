import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long K = Integer.parseInt(sc.next());
        long[] A = new long[N + 1];
        long[] B = new long[M + 1];
        long time = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        A[N] = 2000000000;

        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(sc.next());
        }
        B[M] = 2000000000;

        int j = 0;
        int k = 0;
        while (time <= K) {

            if (A[j] <= B[k] && time + A[j] > K) {
                break;
            } else if (A[j] > B[k] && time + B[k] > K) {
                break;
            } else {
                if (A[j] <= B[k]) {
                    time += A[j];
                    if (j < N) {
                        j++;
                    }
                    count++;
                } else {
                    time += B[k];
                    if (k < M) {
                        k++;
                    }
                    count++;
                }
            }

            if ((j == N) && (k == M)) {
                break;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);

        sc.close();
        out.flush();
    }
}