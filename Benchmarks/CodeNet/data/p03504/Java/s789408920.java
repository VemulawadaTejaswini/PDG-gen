import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), C = sc.nextInt();
        int[][] u = new int[C][200002];
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt(), t = sc.nextInt(), c = sc.nextInt() - 1;
            for (int j = s * 2 - 1; j < t * 2; j++) {
                u[c][j] = 1;
            }
        }

        int max = 0;
        for (int i = 1; i < 200002; i++) {
            int sum = 0;
            for (int j = 0; j < C; j++) {
                sum += u[j][i];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}