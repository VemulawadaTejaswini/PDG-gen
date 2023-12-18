import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            H[i] = sc.nextInt();
        }

        boolean[] isGood = new boolean[N + 1];
        Arrays.fill(isGood, true);
        isGood[0] = false;

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (H[A] <= H[B]) {
                isGood[A] = false;
            }

            if (H[B] <= H[A]) {
                isGood[B] = false;
            }
            
        }
        sc.close();

        int count = 0;
        for (boolean good : isGood) {
            if (good) {
                count++;
            }
        }

        System.out.println(count);

    }

}
