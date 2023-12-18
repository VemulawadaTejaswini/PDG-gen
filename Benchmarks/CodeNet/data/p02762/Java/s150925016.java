import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] map = new int[N][N];

        for(int i = 0; i < M; i++) {
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;
            map[x][y] = map[y][x] = 1;
        }
        for(int i = 0; i < K; i++) {
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;
            map[x][y] = map[y][x] = 1;
        }

        for(int i =0; i < N; i++) {
            int sum = 0;
            for(int j =0; j < N; j++) {
                sum += map[i][j];
            }
            System.out.print(N-(sum+1));
            System.out.print(" ");
        }
    }
}