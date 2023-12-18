import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();

        boolean[][] bord = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            String row = sc.next();
            for (int j = 0; j < W; j++) {
                bord[i][j] = '.' == row.charAt(j);
            }
        }

        int minimum = Integer.MAX_VALUE;
        Deque<int[]> stack = new ArrayDeque<int[]>();
        stack.add(new int[] {0, 0, bord[0][0] ? 0 : 1});
        while (!stack.isEmpty()) {
            int[] e = stack.pop();
            int r = e[0];
            int c = e[1];
            int nr = r + 1;
            int nc = c + 1;
            if (nr == H && nc == W) {
                minimum = e[2] < minimum ? e[2] : minimum;
                continue;
            }
            int[] moveR = new int[3];
            if (nr < H) {
                System.arraycopy(e, 0, moveR, 0, 3);
                moveR[0] += 1;
                if (!bord[nr][c]) {
                    moveR[2] += 1;
                }
            } else {
                moveR[2] = Integer.MAX_VALUE;
            }
            int[] moveC = new int[3];
            if (nc < W) {
                System.arraycopy(e, 0, moveC, 0, 3);
                moveC[1] += 1;
                if (!bord[r][nc]) {
                    moveC[2] += 1;
                }
            } else {
                moveC[2] = Integer.MAX_VALUE;
            }
            if (moveR[2] == moveC[2]) {
                stack.add(moveR);
                stack.add(moveC);
            } else if (moveR[2] < moveC[2]) {
                stack.add(moveR);
            } else {
                stack.add(moveC);
            }
        }
        System.out.println(minimum);
    }
}