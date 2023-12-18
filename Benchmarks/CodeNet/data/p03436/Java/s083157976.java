import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        for (int i=0; i<H; i++) {
            S[i] = sc.next();
        }

        int ans = solve(H, W, S);

        System.out.println(ans);
    }

    private static int solve(int H, int W, String[] S) {
        int shortest = shortest(H, W, S);
        if (shortest == -1) return -1;

//        System.err.println(shortest);
        return H*W - countBlack(H, W, S) - shortest - 1;
    }

    private static int shortest(int H, int W, String[] S) {
        int[][] visit = new int[H][W];
        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                visit[i][j] = -1;
            }
        }
        visit[0][0] = 0;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});

        int[][] move = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        while(!queue.isEmpty()) {
            int[] pos = queue.remove();
//            System.err.println("next: " + pos[0] + ", " + pos[1] + " = " + visit[pos[0]][pos[1]]);

            for (int m=0; m<4; m++) {
                int[] nextPos = {pos[0]+ move[m][0], pos[1] + move[m][1]};
                if (isInside(H, W, nextPos) && S[nextPos[0]].charAt(nextPos[1]) == '.') {
                    if (visit[nextPos[0]][nextPos[1]] == -1) {
                        visit[nextPos[0]][nextPos[1]] = visit[pos[0]][pos[1]] + 1;
                        queue.add(nextPos);
                    } else {
                        visit[nextPos[0]][nextPos[1]] = Math.min(visit[nextPos[0]][nextPos[1]], visit[pos[0]][pos[1]] + 1);
                    }
                }
            }
        }

        return visit[H-1][W-1];
    }

    private static boolean isInside(int H, int W, int[] pos) {
        if (pos[0] < 0 || pos[1] < 0 || pos[0] >= H || pos[1] >= W) {
            return false;
        }

        return true;
    }

    private static int countBlack(int H, int W, String[] S) {
        int count = 0;

        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                if (S[i].charAt(j) == '#') count++;
            }
        }

        return count;
    }
}
