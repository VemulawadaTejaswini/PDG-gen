import java.util.*;

public class Main {

    public static String numberN(int K, int[] A) {
        int m = 0;
        int index = 0;
        for (int i = 0; i < K; i++) {
            if (m < A[i]) {
                m = A[i];
                index = i;
            }
        }
        for (int i = index + 1; i < K; i++) {
            m -= m % A[i];
        }
        if (m != 2) {
            return "-1";
        }
        int min = A[K-1];
        for (int i = K - 2; i >= 0; i--) {
            if (A[i] >= min) {
                min = A[i];
            } else {
                min = A[i] * (min / A[i] + 1);
            }
        }
        int max = min + A[0] - 1;
        return min + " " + max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] A = new int[K];
        for (int i = 0; i < K; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(numberN(K, A));
    }

}
