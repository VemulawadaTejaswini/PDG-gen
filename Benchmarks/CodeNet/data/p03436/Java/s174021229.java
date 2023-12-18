import java.util.*;

public class Main {
    private static int W;
    private static int H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        int[][] s = new int[H + 2][W + 2];
        int count = 0;
        for (int row = 1; row <= H; row++) {
            String cur = sc.next();
            for (int col = 1; col <= W; col++) {
                char temp = cur.charAt(col - 1);
                if (temp == '.') {
                    s[row][col] = 1;
                    count++;
                }
            }
        }
        int res = bfs(s);
        if (res == -1) System.out.println(-1);
        else System.out.println(count - res);
    }
    static int bfs(int[][] s) {
        boolean[][] record = new boolean[H + 2][W + 2];

        int count = 1;
        LinkedList<int[]> cur = new LinkedList<>();
        LinkedList<int[]> next = new LinkedList<>();
        cur.add(new int[]{1, 1});
        while (cur.size() > 0) {
            int[] now = cur.remove();
            if (now[0] == H && now[1] == W) return count;
            if ((!record[now[0]][now[1]]) && s[now[0]][now[1]] != 0) {
                record[now[0]][now[1]] = true;
                next.add(new int[]{now[0] - 1, now[1]});
                next.add(new int[]{now[0] + 1, now[1]});
                next.add(new int[]{now[0], now[1] - 1});
                next.add(new int[]{now[0], now[1] + 1});
            }
            if (cur.size() == 0) {
                count++;
                cur = next;
                next = new LinkedList<>();
            }
        }
        return -1;
    }
}