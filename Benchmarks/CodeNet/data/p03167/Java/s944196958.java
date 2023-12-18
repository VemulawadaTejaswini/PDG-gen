import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        String kda = in.nextLine();

        int MOD = 1_000_000_007;
        int[][] memo = new int[H][W];
        for (int i = 0; i < H; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < W; j++) {
                if (line[j] == '.') {
                    if (i == 0) {
                        if (j == 0) {
                            memo[i][j] = 1;
                        } else {
                            memo[i][j] = memo[i][j - 1];
                        }
                    } else {
                        if (j == 0) {
                            memo[i][j] = memo[i - 1][j];
                        } else {
                            memo[i][j] = (memo[i - 1][j] + memo[i][j - 1]) % MOD;
                        }
                    }
                }
            }
        }
        System.out.println(memo[H - 1][W - 1]);
    }
}