import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static final String ex = "9\n" +
            "1 3 6 13 15 18 19 29 31\n" +
            "10\n" +
            "4\n" +
            "1 8\n" +
            "7 3\n" +
            "6 7\n" +
            "8 5";

    private static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());

        String[] split = scanner.nextLine().split(" ");
        int[] x = new int[N + 1];
        for (int i = 0; i < N; i ++) {
            x[i + 1] = Integer.parseInt(split[i]);
        }

        int L = Integer.parseInt(scanner.nextLine());

        int[][] days = new int[N + 1][N + 1];

        for (int i = 0; i < N + 1; i++) {
            int day = 0;
            int j = i + 1;
            while (j < N) {
                int lastStop = j - 1;
                while (j < N && x[j] - x[lastStop] <= L) {
                    days[i][j] = day + 1;
                    j ++;
                }
                day ++;
            }
            days[i][i] = 0;
        }

        for (int i = N; i >= 0; i --) {
            int day = 0;
            int j = i - 1;
            while (j >= 0) {
                int lastStop = j + 1;
                while (j >= 0 && x[lastStop] - x[j] <= L) {
                    days[i][j] = day + 1;
                    j --;
                }
                day ++;
            }
            days[i][i] = 0;
        }

        int Q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Q; i ++) {
            split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            System.out.println(days[a][b]);
        }
    }
}

