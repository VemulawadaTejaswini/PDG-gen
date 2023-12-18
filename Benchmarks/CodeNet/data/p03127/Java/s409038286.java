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
        int min0 = A[0];
        int min = min0 + 1;
        int tmp = 0;
        while (tmp != min) {
            tmp = min;
            for (int i = 0; i < N; i++) {
                if (A[i] % min < min && A[i] % min != 0) {
                    min = A[i] % min;
                }
            }
        }

        System.out.println(min);

        sc.close();
    }
}