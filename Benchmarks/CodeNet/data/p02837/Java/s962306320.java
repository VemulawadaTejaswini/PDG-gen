import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[][] array = new int[N+1][];
            for (int i = 1; i <= N; ++i) {
                array[i] = new int[N+1];
                for (int j = 0; j <= N; j++) {
                    array[i][j] = -1;
                }
            }

            for (int i = 1; i <= N; ++i) {
                int A = sc.nextInt();
                array[i][i] = -1;
                for (int j = 0; j < A; ++j) {
                    array[sc.nextInt()][i] = sc.nextInt();
                }
            }

            int honest = N;
            for (int i = 1; i <= N; ++i) {
                int defaultVal = -1;
                for (int j = 1; j <= N; ++j) {
                    if (array[i][j] == -1) {
                        continue;
                    }
                    if (defaultVal == -1) {
                        defaultVal = array[i][j];
                    } else if (array[i][j] != defaultVal) {
                        honest--;
                    }
                }
            }
            System.out.println(honest);
        }
    }

}
