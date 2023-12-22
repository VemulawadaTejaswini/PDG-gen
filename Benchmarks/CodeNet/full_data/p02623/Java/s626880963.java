import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long K = Integer.parseInt(sc.next());
        long[] A = new long[N];
        long[] B = new long[M];
        long time = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(sc.next());
        }

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
                    if (j != N - 1) {
                        j++;
                    }
                    count++;
                } else {
                    time += B[k];
                    if (k != M - 1) {
                        k++;
                    }
                    count++;
                }
            }

            if ((j == N - 1) && (k == M - 1)) {
                break;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);

        sc.close();
        out.flush();
    }
}