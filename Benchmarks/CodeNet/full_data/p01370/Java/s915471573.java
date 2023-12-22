import java.util.*;
import java.lang.*;

class Main {
    static Deque<Integer> nowX = new ArrayDeque<Integer>();
    static Deque<Integer> nowY = new ArrayDeque<Integer>();
    static Scanner scan = new Scanner(System.in);
    static int ans;

    public static void main(String[] args) {
        while (scan.hasNext()) {
            boolean[][] field = new boolean[101][101];
            int turn = scan.nextInt();
            int n = scan.nextInt();
            if (turn == 0) {
                break;
            }
            init(field, n);
            for (int i = 0; i < turn; i++) {
                bfs(field);
            }
            System.out.println(ans);
        }
    }

    static void init(boolean field[][], int n) {
        while (nowX.peek() != null) {
            nowX.remove();
            nowY.remove();
        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                field[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            int x1 = scan.nextInt() + 50;
            int y1 = scan.nextInt() + 50;
            field[x1][y1] = true;
        }
        int x = scan.nextInt() + 50;
        int y = scan.nextInt() + 50;
        nowX.add(x);
        nowY.add(y);
        ans = 1;
        field[x][y] = true;
    }

    static void bfs(boolean field[][]) {
        Deque<Integer> nextX = new ArrayDeque<Integer>();
        Deque<Integer> nextY = new ArrayDeque<Integer>();
        int[] dx = {0, 1, 1, 0, -1, -1};
        int[] dy = {1, 1, 0, -1, -1, 0};
        while (nowX.peek() != null) {
            int x = nowX.remove();
            int y = nowY.remove();
            for (int i = 0; i < 6; i++) {
                if (check(x+dx[i]) && check(y+dy[i]) && 
                        !field[x+dx[i]][y+dy[i]]) {
                    ans++;
                    field[x+dx[i]][y+dy[i]] = true;
                    //System.out.println(x+dx[i]);
                    //System.out.println(y+dy[i]);
                    nextX.add(x+dx[i]);
                    nextY.add(y+dy[i]);
                }
            }
        }
        nowX = nextX;
        nowY = nextY;
    }

    static boolean check(int a) {
        if (0 <= a && a <= 100) {
            return true;
        } else {
            return false;
        }
    }
}