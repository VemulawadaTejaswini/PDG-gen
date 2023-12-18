import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int d = scanner.nextInt();
        scanner.nextLine();

        final int[][] vectors = new int[n][d];
        for (int i = 0; i < n; i++) {
            vectors[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = 0;
                for (int k = 0; k < d; k++) {
                    dist += (vectors[i][k] - vectors[j][k]) * (vectors[i][k] - vectors[j][k]);
                }

                final double realDist = Math.sqrt(dist);
                if (realDist == Math.floor(realDist)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}