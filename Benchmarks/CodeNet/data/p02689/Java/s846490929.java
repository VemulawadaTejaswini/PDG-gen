import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        int A, B;
        int[][] ways = new int[N][N];

        for (int i = 0; i < M; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            ways[A - 1][B - 1] = 1;
            ways[B - 1][A - 1] = 1;
        }
        /*
         * for (int i = 0; i < ways.length; i++) { for (int j = 0; j < ways.length; j++)
         * { System.out.print(ways[i][j]); } System.out.println(); }
         */

        List<Integer> Dtowers = new ArrayList<>();

        for (int i = 0; i < ways.length; i++) {
            for (int j = 0; j < ways.length; j++) {
                if (ways[i][j] == 1 && H[j] >= H[i]) {
                    // System.out.println(j+"の方が高い、良い展望台でない : " + i);
                    Dtowers.add(i);
                    break;
                }
            }
        }

        System.out.println(N - Dtowers.size());

        sc.close();
    }
}