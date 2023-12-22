import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }
        int[][][] dp = new int[n + 1][4][4];
        dp[0][0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < 4; a++) {
                for (int b = 0; b < 4; b++) {
                    for (int c = 1; c < 4; c++) {
                        if (map.containsKey(i) && map.get(i) != c) {
                            continue;
                        }
                        if (a == b && b == c) {
                            continue;
                        }
                        dp[i][b][c] += dp[i - 1][a][b];
                        dp[i][b][c] %= 10000;
                    }
                }
            }
        }
        int sum = 0;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                sum += dp[n][a][b];
                sum %= 10000;
            }
        }
        System.out.println(sum);
    }
}

