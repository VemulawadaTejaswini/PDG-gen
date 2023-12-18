import java.util.Arrays;
import java.util.Scanner;

/**
 * ABC118C
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int min = A[N - 1];
        while (A[N - 2] != 0) {
            A[N - 1] = A[N - 1] % A[N - 2];
            Arrays.sort(A);
            min = A[N - 1];
        }

        System.out.println(min);

        sc.close();
    }
}