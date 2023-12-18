import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        double ans = 0.0;
        for (int j = 0; j < N; j++) {
            for (int i = j + 1; i < N; i++) {
                ans += dist(x[j], x[i], y[j], y[i]);
            }
        }
        double n = N / (double)2;

        System.out.println(ans / n);

    }

    private double dist(int x1, int x2, int y1, int y2) {
        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }
}