import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, A));
    }

    private static int solve(int N, int[] A) {
        Arrays.sort(A);

        int count = 0;
        int maxSize = 0;
        for (int i=0; i<N; i++) {
            if (A[i] > maxSize*2) {
                count = 1;
            } else {
                count++;
            }
            maxSize += A[i];
        }

        return count;
    }
}
