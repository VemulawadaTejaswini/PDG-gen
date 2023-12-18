import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        sc.nextLine();

        char WHITE = '.';
        char BLACK = '#';

        int whiteNum = 0;
        int pathLength = -1;

        char[][] grid = new char[H][W];

        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < W; j++) {
                char c = line.charAt(j);
                if (c == WHITE) whiteNum++;
                grid[i][j] = c;
            }
        }

        Queue<Integer> iqueue = new LinkedList<>();
        Queue<Integer> jqueue = new LinkedList<>();
        iqueue.add(0);
        jqueue.add(0);
        int[][] countGrid = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                countGrid[i][j] = Integer.MAX_VALUE;
            }
        }

        countGrid[0][0] = 0;

        LOOP: while (!iqueue.isEmpty()) {
            int inow = iqueue.poll();
            int jnow = jqueue.poll();

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    if (i != 0 && j != 0) continue;
                    if (inow + i < 0 || jnow + j < 0) continue;
                    if (inow + i >= H || jnow + j >= W) continue;
                    if (grid[inow + i][j + jnow] == BLACK) continue;

                    if (countGrid[inow][jnow] + 1 < countGrid[inow + i][jnow + j]) {
                        countGrid[inow + i][jnow + j] = countGrid[inow][jnow] + 1;

                        iqueue.add(inow + i);
                        jqueue.add(jnow + j);
                    }

                    if (inow + i == H - 1 && jnow + j == W - 1) {
                        pathLength = countGrid[inow + i][j + jnow];
                        break;
                    }
                }
            }
        }

        if (pathLength == -1) {
            System.out.println(-1);
        } else {
            System.out.println(whiteNum - pathLength - 1);
        }
    }
}