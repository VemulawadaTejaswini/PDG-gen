import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] h = new int[n];
        boolean[][] path = new boolean[n][n];

        for (boolean[] row : path) {
            Arrays.fill(row, false);
        }

        str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            path[Integer.parseInt(str[0]) - 1][Integer.parseInt(str[1]) - 1] = true;
            path[Integer.parseInt(str[1]) - 1][Integer.parseInt(str[0]) - 1] = true;
        }

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
