import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int[][] point = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                point[i][j] = Integer.parseInt(sc.next());
            }
        }

        int counter = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int tmpSum = 0;
                for (int k = 0; k < D; k++) {
                    tmpSum += Math.pow(point[i][k] - point[j][k], 2);
                }

                if (isPerfectSquare(tmpSum)) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }

    private static boolean isPerfectSquare(int n) {
        if (n < 0)
            return false;

        int tst = (int) Math.round((Math.sqrt(n) + 0.5));
        return tst * tst == n;
    }
}