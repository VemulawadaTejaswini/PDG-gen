import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = scanner.nextInt();

        int[] aArray = new int[A];
        int[] bArray = new int[B];
        int[][] mArray = new int[M][3];

        int minA = 10000;
        int minB = 10000;
        for (int i = 0; i < A; i++) {
            aArray[i] = scanner.nextInt();
            minA = Math.min(aArray[i], minA);
        }
        for (int i = 0; i < B; i++) {
            bArray[i] = scanner.nextInt();
            minB = Math.min(bArray[i], minB);
        }

        int ans = minA + minB;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 3; j++) {
                mArray[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        for (int[] item : mArray) {

            ans = Math.min(aArray[item[0] - 1] + bArray[item[1] - 1] - item[2], ans);

        }

        System.out.println(ans);

    }
}
