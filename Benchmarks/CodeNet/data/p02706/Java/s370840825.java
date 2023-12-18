import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[M];
        long sum = 0;
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        if (N - sum < 0) {
            System.out.println(-1);
        } else {
            System.out.println(N - sum);
        }
    }
}