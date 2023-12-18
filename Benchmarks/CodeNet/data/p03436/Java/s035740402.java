import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static boolean[][] a;
    static boolean[][] b;
    static int[][] nexts = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        a = new boolean[h][w];
        b = new boolean[h][w];
        int block = h * w;
        for (int i = 0; i < h; i++) {
            char[] line = scan.next().toCharArray();
            for (int j = 0; j < w; j++) {
                a[i][j] = line[j] == '.';
                block -= line[j] == '.' ? 1: 0;
            }
        }
        Deque<Tuple> q = new ArrayDeque<>();
        q.add(new Tuple(1, 0, 0));
        while (!q.isEmpty()) {
            Tuple c = q.removeFirst();
            if(c.x == w -1 && c.y == h - 1) {
                System.out.println(h *w - block - c.s);
                return;
            }
            for(int[] diff: nexts) {
                int nx = c.x + diff[0];
                int ny =  c.y + diff[1];
                if(nx< 0 || w <= nx || ny< 0 || h <=ny || !a[ny][nx] || b[ny][nx]) {
                    continue;
                }
                b[ny][nx] = true;
                q.addLast(new Tuple(c.s+1, nx, ny));
            }
        }
        System.out.println(-1);
    }

    static class Tuple{
        int s;
        int x;
        int y;
        Tuple(int s, int x, int y) {
            this.s = s;
            this.x = x;
            this.y = y;
        }
    }
}

