import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 展望台の数
        int M = sc.nextInt(); // 道の数
        int[] H = new int[N]; // 各展望台の標高
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int[][] path = new int[N][N];
        int A;
        int B;
        for (int i = 1; i <= M; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            path[A - 1][B - 1] = 1;
            path[B - 1][A - 1] = 1;
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(path[i][j] + " ");
//            }
//            System.out.println("");
//        }
        int bad = 0;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            for (int j = 0; j < N; j++) {
                if (path[i][j] != 0 && H[i] <= H[j]) {
                    tmp = 1;
                    break;
                }
            }
            if (tmp != 0) {
                bad++;
            }
        }

        System.out.println(N - bad);
    }
}