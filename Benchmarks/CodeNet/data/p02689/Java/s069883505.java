import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] str = br.readLine().split(" ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] h = new int[n];
        boolean[][] path = new boolean[n][n];

        // for (boolean[] row : path) {
        // Arrays.fill(row, false);
        // }

        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < m; i++) {
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            path[x - 1][y - 1] = true;
            path[y - 1][x - 1] = true;
        }

        sc.close();
        int result = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (path[i][j] && h[i] <= h[j]) {
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
