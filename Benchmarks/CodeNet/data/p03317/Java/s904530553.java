import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int c = 0;

        int minIndex = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
        }
        if (N <= K) {
            System.out.println(1);
            return;
        }

        for (int i = minIndex; i > 0;) {
            boolean f = false;
            for (int j = 1; j <= K && minIndex - j >= 0; j++) {
                if (A[minIndex] == A[minIndex - j]) {
                    f = true;
                    break;
                }
            }
            if (f) {
                i -= 3;
            } else {
                i -= 2;
            }
            c++;
        }

        for (int i = minIndex; i < N;) {
            boolean f = false;
            for (int j = 1; j <= K && minIndex + j < N; j++) {
                if (A[minIndex] == A[minIndex + j]) {
                    f = true;
                    break;
                }
            }
            if (f) {
                i += 3;
            } else {
                i += 2;
            }
            c++;
        }
        System.out.println(c);
    }
}