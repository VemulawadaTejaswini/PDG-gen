
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        int minA = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            minA = Math.min(A[i], minA);
        }

        int count = 0;

        loop: for (int candidate = minA / 2; candidate <= M; candidate++) {
            for (int a : A) {
                if ((2 * candidate) % a != 0) {
                    continue loop;
                }
                if (((2 * candidate) / a - 1) % 2 != 0) {
                    continue loop;
                }
            }

            count++;
        }

        System.out.println(count);
    }

}
