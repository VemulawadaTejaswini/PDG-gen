import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        // index(0-origin), prefecture(1-origin), year, order(1-origin)
        int[][] cities = new int[m][3];
        for (int i = 0; i < m; i++) {
            int prefecture = scanner.nextInt();
            int year = scanner.nextInt();
            cities[i] = new int[]{i, prefecture, year, 0};
        }

        String[] messages = new String[m];
        Arrays.sort(cities, (a, b) -> (a[1] == b[1]) ? a[2] - b[2] : a[1] - b[1]);
        messages[cities[0][0]] = String.format("%06d", cities[0][1]) + String.format("%06d", 1);
        int order = 1;
        for (int i = 1; i < m; i++) {
            if (cities[i - 1][1] != cities[i][1]) {
                messages[cities[i][0]] = String.format("%06d", cities[i][1]) + String.format("%06d", 1);
                order = 1;
            } else {
                messages[cities[i][0]] = String.format("%06d", cities[i][1]) + String.format("%06d", ++order);
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(messages[i]);
        }
    }
}
