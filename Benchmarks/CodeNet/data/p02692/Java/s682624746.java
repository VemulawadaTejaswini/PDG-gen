
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    private void exec(int[] x, int i, int j) {
        ++x[i];
        --x[j];
    }

    private void run() {
        int N = sc.nextInt();
        int[] x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            x[i] = Math.min(2, x[i]);
        }

        boolean[][][][] dp = new boolean[N + 1][3][3][3];
        dp[0][x[0]][x[1]][x[2]] = true;
        int[][][][][] prev = new int[N + 1][3][3][3][4];

        for (int i = 0; i < N; i++) {
            String s = sc.next();

            for (int l1 = 0; l1 < 3; ++l1) {
                for (int l2 = 0; l2 < 3; l2++) {
                    for (int l3 = 0; l3 < 3; l3++) {
                        if (!dp[i][l1][l2][l3]) {
                            continue;
                        }

                        int t1 = l1, t2 = l2, t3 = l3;
                        if (s.equals("AB")) {
                            if (t1 - 1 >= 0) {
                                t1 = t1 - 1;
                                t2 = Math.min(2, t2 + 1);
                                dp[i + 1][t1][t2][t3] = true;
                                prev[i + 1][t1][t2][t3][0] = l1;
                                prev[i + 1][t1][t2][t3][1] = l2;
                                prev[i + 1][t1][t2][t3][2] = l3;
                                prev[i + 1][t1][t2][t3][3] = 1;
                            }

                            t1 = l1; t2 = l2; t3 = l3;
                            if (t2 - 1 >= 0){
                                t1 = Math.min(2, t1 + 1);
                                t2 = t2 - 1;
                                dp[i + 1][t1][t2][t3] = true;
                                prev[i + 1][t1][t2][t3][0] = l1;
                                prev[i + 1][t1][t2][t3][1] = l2;
                                prev[i + 1][t1][t2][t3][2] = l3;
                                prev[i + 1][t1][t2][t3][3] = 0;
                            }
                        } else if (s.equals("BC")) {
                            if (t2 - 1 >= 0) {
                                t2 = t2 - 1;
                                t3 = Math.min(2, t3 + 1);
                                dp[i + 1][t1][t2][t3] = true;
                                prev[i + 1][t1][t2][t3][0] = l1;
                                prev[i + 1][t1][t2][t3][1] = l2;
                                prev[i + 1][t1][t2][t3][2] = l3;
                                prev[i + 1][t1][t2][t3][3] = 2;
                            }

                            t1 = l1; t2 = l2; t3 = l3;
                            if (t3 - 1 >= 0) {
                                t2 = Math.min(2, t2 + 1);
                                t3 = t3 - 1;
                                dp[i + 1][t1][t2][t3] = true;
                                prev[i + 1][t1][t2][t3][0] = l1;
                                prev[i + 1][t1][t2][t3][1] = l2;
                                prev[i + 1][t1][t2][t3][2] = l3;
                                prev[i + 1][t1][t2][t3][3] = 1;
                            }
                        } else {
                            if (t1 - 1 >= 0) {
                                t1 = t1 - 1;
                                t3 = Math.min(2, t3 + 1);
                                dp[i + 1][t1][t2][t3] = true;
                                prev[i + 1][t1][t2][t3][0] = l1;
                                prev[i + 1][t1][t2][t3][1] = l2;
                                prev[i + 1][t1][t2][t3][2] = l3;
                                prev[i + 1][t1][t2][t3][3] = 2;
                            }

                            t1 = l1; t2 = l2; t3 = l3;
                            if (t3 - 1 >= 0) {
                                t1 = Math.min(2, t1 + 1);
                                t3 = t3 - 1;
                                dp[i + 1][t1][t2][t3] = true;
                                prev[i + 1][t1][t2][t3][0] = l1;
                                prev[i + 1][t1][t2][t3][1] = l2;
                                prev[i + 1][t1][t2][t3][2] = l3;
                                prev[i + 1][t1][t2][t3][3] = 0;
                            }
                        }
                    }
                }
            }
        }

        for (int l1 = 0; l1 < 3; l1++) {
            for (int l2 = 0; l2 < 3; l2++) {
                for (int l3 = 0; l3 < 3; l3++) {
                    if (dp[N][l1][l2][l3]) {
                        System.out.println("Yes");

                        List<Integer> ans = new ArrayList<>();
                        int t1 = l1, t2 = l2, t3 = l3;
                        for (int t = N; t > 0; --t) {
                            ans.add(prev[t][t1][t2][t3][3]);
                            int a1 = prev[t][t1][t2][t3][0];
                            int a2 = prev[t][t1][t2][t3][1];
                            int a3 = prev[t][t1][t2][t3][2];

                            t1 = a1;
                            t2 = a2;
                            t3 = a3;
                        }

                        for (int t = N - 1; t >= 0; --t) {
                            int v = ans.get(t);
                            if (v == 0) {
                                System.out.println("A");
                            } else if (v == 1) {
                                System.out.println("B");
                            } else {
                                System.out.println("C");
                            }
                        }

                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
