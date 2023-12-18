import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();

        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                int dist = 0;
                for (int k = 0; k < d; k++) {
                    dist += (Math.abs(x[i][k] - x[j][k])) * (Math.abs(x[i][k] - x[j][k]));
                }

                for (int k = 1; k <= Math.sqrt(dist); k++) {
                    if (k * k == dist) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
