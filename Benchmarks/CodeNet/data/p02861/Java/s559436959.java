import java.util.Scanner;

public class Main {
    private static int[] x;
    private static int[] y;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            x = new int[N];
            y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            double[] sum = new double[1];
            int[] count = new int[1];
            dfs(0, N, new boolean[N], new int[N], sum, count);

            System.out.println(sum[0] / count[0]);
        }
    }

    private static void dfs(int index, int N, boolean[] used, int[] number, double[] sum, int[] count) {
        if (index >= N) {
            sum[0] += calculateLength(number);
            count[0]++;
            return;
        }

        for (int n = 0; n < N; n++) {
            if (used[n]) {
                continue;
            }
            used[n] = true;
            number[index] = n;
            dfs(index + 1, N, used, number, sum, count);
            used[n] = !true;
        }
    }

    private static double calculateLength(int[] number) {
        double l = 0;
        for (int i = 1; i < number.length; i++) {
            l += distance(number[i - 1], number[i]);
        }
        return l;
    }

    private static double distance(int i, int j) {
        double dx = x[i] - x[j];
        double dy = y[i] - y[j];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
