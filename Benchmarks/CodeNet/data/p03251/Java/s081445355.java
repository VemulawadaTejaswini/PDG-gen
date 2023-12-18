import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();
            int[] x = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }
            int[] y = new int[M];
            for (int i = 0; i < M; i++) {
                y[i] = in.nextInt();
            }
            int minY = Y;
            for (int i = 0; i < M; i++) {
                minY = Math.min(minY, y[i]);
            }
            System.out.println(isWar(minY, X, x) ? "War" : "No War");
        }
    }

    private static boolean isWar(int minY, int X, int[] x) {
        if (X >= minY) {
            return true;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= minY) {
                return true;
            }
        }
        return false;
    }
}
