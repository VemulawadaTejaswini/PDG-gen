import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        for (int i=0; i<H; i++) {
            S[i] = sc.next();
        }

        System.out.println(solve(H, W, S) ? "Yes" : "No");
    }

    private static boolean solve(int H, int W, String[] S) {
        int[][] d = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        for (int h=0; h<H; h++) {
            for (int w=0; w<W; w++) {
                if (S[h].charAt(w) == '#') {
                    boolean ok = false;

                    for (int idx=0; idx<d.length; idx++) {
                        int nextH = h + d[idx][0];
                        int nextW = w + d[idx][1];

                        if (nextH < 0 || nextH >= H || nextW < 0 || nextW >= W) continue;

                        if (S[nextH].charAt(nextW) == '#') {
                            ok = true;
                        }
                    }

                    if (!ok) return false;
                }
            }
        }


        return true;
    }
}