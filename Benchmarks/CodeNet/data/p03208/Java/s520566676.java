import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] maxes = new int[K];
        int[] mins = new int[K];
        Arrays.fill(mins, Integer.MAX_VALUE);
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();

            if (h > maxes[K - 1]) {
                maxes[K - 1] = h;
                for (int j = K - 1; j > 0; j--) {
                    if (maxes[j] > maxes[j - 1]) {
                        int tmp = maxes[j - 1];
                        maxes[j - 1] = maxes[j];
                        maxes[j] = tmp;
                    } else {
                        break;
                    }
                }
            }

            if (h < mins[K - 1]) {
                mins[K - 1] = h;
                for (int j = K - 1; j > 0; j--) {
                    if (mins[j] < mins[j - 1]) {
                        int tmp = mins[j - 1];
                        mins[j - 1] = mins[j];
                        mins[j] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(Math.min(maxes[0] - maxes[K - 1], mins[K - 1] - mins[0]));
    }
}