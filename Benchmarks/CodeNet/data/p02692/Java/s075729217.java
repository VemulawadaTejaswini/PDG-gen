import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int INF = -(int) 1e6;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = sc.nextInt();
        }
        //選ばれてないもの(A=0, B=1, C=2)が入る
        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            switch (str) {
                case "AB":
                    s[i] = 2;
                    break;
                case "BC":
                    s[i] = 0;
                    break;
                case "AC":
                    s[i] = 1;
                    break;
            }
        }

        //dp[i][mVar][sVar][var] = (i回目までの操作を終わったときにmVarを最大化、そのもとでsVarを最大化するように操作したときのvarの値)
        int[][][][] dp = new int[N + 1][3][3][3];

        //初期化
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[0][i][j][k] = ABC[k];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int mVar = 0; mVar < 3; mVar++) {
                for (int sVar = 0; sVar < 3; sVar++) {
                    if (mVar == sVar) {
                        continue;
                    }
                    if (s[i] == mVar) {
                        //sVarを最大化する場合
                        int tVar = unChosen(mVar, sVar);
                        if (dp[i][mVar][sVar][tVar] > 0) {
                            dp[i + 1][mVar][sVar][sVar] = dp[i][mVar][sVar][sVar] + 1;
                            dp[i + 1][mVar][sVar][tVar] = dp[i][mVar][sVar][tVar] - 1;
                            dp[i + 1][mVar][sVar][mVar] = dp[i][mVar][sVar][mVar];
                        } else if (dp[i][mVar][sVar][sVar] > 0) {
                            dp[i + 1][mVar][sVar][sVar] = dp[i][mVar][sVar][sVar] - 1;
                            dp[i + 1][mVar][sVar][tVar] = dp[i][mVar][sVar][tVar] + 1;
                            dp[i + 1][mVar][sVar][mVar] = dp[i][mVar][sVar][mVar];
                        } else {
                            dp[N][mVar][sVar][mVar] = INF;
                            dp[N][mVar][sVar][sVar] = INF;
                            dp[N][mVar][sVar][tVar] = INF;
                        }
                    } else {
                        //mVarを最大化する場合
                        int uVar = unChosen(mVar, s[i]);
                        if (dp[i][mVar][sVar][uVar] > 0) {
                            dp[i + 1][mVar][sVar][mVar] = dp[i][mVar][sVar][mVar] + 1;
                            dp[i + 1][mVar][sVar][uVar] = dp[i][mVar][sVar][uVar] - 1;
                            dp[i + 1][mVar][sVar][s[i]] = dp[i][mVar][sVar][s[i]];
                        } else if (dp[i][mVar][sVar][mVar] > 0) {
                            dp[i + 1][mVar][sVar][mVar] = dp[i][mVar][sVar][mVar] - 1;
                            dp[i + 1][mVar][sVar][uVar] = dp[i][mVar][sVar][uVar] + 1;
                            dp[i + 1][mVar][sVar][s[i]] = dp[i][mVar][sVar][s[i]];
                        } else {
                            dp[N][mVar][sVar][mVar] = INF;
                            dp[N][mVar][sVar][uVar] = INF;
                            dp[N][mVar][sVar][s[i]] = INF;
                        }
                    }
                }
            }
        }

        StringBuilder strb = new StringBuilder();
        boolean found = false;
        for (int mVar = 0; mVar < 3 && !found; mVar++) {
            for (int sVar = 0; sVar < 3 && !found; sVar++) {
                if (mVar == sVar) {
                    continue;
                }
                if (isAllNonNegative(dp[N][mVar][sVar])) {
                    int[][] result = new int[N + 1][3];
                    //操作を復元
                    for (int i = 0; i < N + 1; i++) {
                        for (int val = 0; val < 3; val++) {
                            result[i][val] = dp[i][mVar][sVar][val];
                        }
                    }
                    for (int i = 0; i < N; i++) {
                        for (int val = 0; val < 3; val++) {
                            if ((result[i + 1][val] - result[i][val]) == 1) {
                                strb.append("ABC".charAt(val));
                                strb.append("\n");
                            }
                        }
                    }
                    found = true;
                }
            }
        }
        String ans = found ? "Yes\n" : "No\n";
        ans = ans + strb.toString();
        System.out.println(ans);
    }

    private static int unChosen(int x, int y) {
        return 3 - x - y;
    }

    private static boolean isAllNonNegative(int[] vals) {
        boolean result = true;
        for (int val : vals) {
            if (val < 0) {
                result = false;
            }
        }
        return result;
    }
}
