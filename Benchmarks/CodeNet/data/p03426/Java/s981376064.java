import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[h * w];
        int[] y = new int[h * w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = scanner.nextInt() - 1;
                x[a] = j;
                y[a] = i;
            }
        }

        int[] dist = new int[h * w];
        for (int i = 0; i < h * w; i++) {
            if (i > d) {
                dist[i] = dist[i - d] + Math.abs(x[i - d] - x[i]) + Math.abs(y[i - d] - y[i]);
            }
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            System.out.println(dist[r] - dist[l]);
        }
    }
}