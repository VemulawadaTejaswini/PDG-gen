import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] a = new int[C + 1][1000002];
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int c = scanner.nextInt();

            a[c][s]++;
            a[c][t + 1]--;
        }

        for (int i = 1; i <= C; i++) {
            Arrays.parallelPrefix(a[i], Integer::sum);
            for (int j = 1; j < 1000002; j++) {
                a[0][j] += Math.min(1, a[i][j]);
            }
        }

        Arrays.stream(a[0]).max().ifPresent(System.out::println);
    }
}