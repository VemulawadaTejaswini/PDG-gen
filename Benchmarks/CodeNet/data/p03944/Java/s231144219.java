import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int W, H, N;
        W = scanner.nextInt();
        H = scanner.nextInt();
        N = scanner.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            a[i] = scanner.nextInt();
        }

        int[][] map = new int[W][H];
        for (int i = 0; i < W; i++) for (int j = 0; j < H; j++) map[i][j] = 0;

        for (int n = 0; n < N; n++) {
            switch (a[n]) {
                case 1:
                    for (int i = 0; i < x[n]; i++) for (int j = 0; j < H; j++) ++map[i][j];
                    break;
                case 2:
                    for (int i = x[n]; i < W; i++) for (int j = 0; j < H; j++) ++map[i][j];
                    break;
                case 3:
                    for (int i = 0; i < y[n]; i++) for (int j = 0; j < W; j++) ++map[j][i];
                    break;
                case 4:
                    for (int i = y[n]; i < H; i++) for (int j = 0; j < W; j++) ++map[j][i];
                    break;
            }
        }

        int ans = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                ans += map[i][j] == 0 ? 1 : 0;
            }
        }

        System.out.println(ans);
    }

}
