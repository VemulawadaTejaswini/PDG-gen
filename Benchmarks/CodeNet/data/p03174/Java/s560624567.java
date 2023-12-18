import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(reader.readLine());

        boolean[][] compatible = new boolean[count][count];

        for (int i = 0; i < count; ++i) {
            ArrayList<Integer> current = new ArrayList<>();
            String[] parts = reader.readLine().split(" ");
            for (int j = 0; j < count; ++j) {
                if (Integer.valueOf(parts[j]) == 1) {
                    compatible[i][j] = true;
                }
            }
        }
        long modulo = 1_000_000_007;

        int combinations = 1 << count;
        long[][] dp = new long[count + 1][combinations];
        dp[0][0] = 1;
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < count; ++j) {
                if (compatible[i][j]) {
                    for (int c = 0; c < combinations; ++c) {
                        if ((c & (1 << j)) != 0) {
                            dp[i + 1][c] += dp[i][c & ~(1 << j)];
                            dp[i + 1][c] %= modulo;
                        }
                    }
                }
            }
        }

        long res = 0;
        for (int c = 0; c < combinations; ++c) {
            res += dp[count][c];
            res %= modulo;
        }
        System.out.println(res);
    }
}
