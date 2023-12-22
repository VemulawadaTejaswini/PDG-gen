import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();

        int[] C = new int[N];
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
            backtrack(0, A, C, 0, X, new int[M]);
            if (minimum == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(minimum);
            }
        }
    }

    private static int minimum = Integer.MAX_VALUE;

    private static void backtrack(int minPrice, int[][] A, int[] price, int start, int X, int[] calculated) {
//        System.out.println(Arrays.toString(calculated));
//        System.out.println(" start = " + start + " minPrice = " + minPrice);
        if (start > price.length) {
            return;
        }

        int flag = 0;
        for (int value : calculated) {
            if (value < X) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            minimum = Math.min(minPrice, minimum);
        }


        for (int i = start; i < price.length; i++) {
            int[] temp = new int[calculated.length];
            System.arraycopy(calculated, 0, temp, 0, calculated.length);

            for (int j = 0; j < calculated.length; j++) {
                calculated[j] += A[i][j];
            }
            minPrice += price[i];
            backtrack(minPrice, A, price, start + 1, X, calculated);
            System.arraycopy(temp, 0, calculated, 0, calculated.length);
            minPrice -= price[i];
        }
    }
}