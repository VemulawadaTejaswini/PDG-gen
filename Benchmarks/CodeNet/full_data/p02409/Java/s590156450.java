import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] B = new int[4][3][10];

        int N = Integer.parseInt(sc.next());
        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());

            B[b - 1][f - 1][r - 1] += v;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.printf(" %d", B[i][j][k]);
                }
                System.out.println();
            }
            if (i != 3) System.out.println("####################");
        }
    }
}