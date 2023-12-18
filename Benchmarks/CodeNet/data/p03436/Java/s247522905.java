import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};
    static int[] x8 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] y8 = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt();
        char[][] s = new char[h][w];
        int[][] d = new int[h][w];
        for(int i = 0; i < h; i++) {
            s[i] = in.next().toCharArray();
            Arrays.fill(d[i], Integer.MAX_VALUE);
        }

        Queue<P> queue = new ArrayDeque<>();
        queue.add(new P(0, 0));
        d[0][0] = 0;
        while(!queue.isEmpty()) {
            P c = queue.remove();
            for(int i = 0; i < 4; i++) {
                int x = c.x + x4[i];
                int y = c.y + y4[i];
                if(0 <= x && x < w && 0 <= y && y < h && s[y][x] == '.' && d[y][x] == Integer.MAX_VALUE) {
                    P n = new P(x, y);
                    queue.add(n);
                    d[y][x] = Math.min(d[y][x], d[c.y][c.x] + 1);
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < h; i++)
            for(int j = 0; j < w; j++) if(s[i][j] == '#') cnt++;

        int ans = h*w - cnt - d[h-1][w-1] - 1;
        System.out.println(ans);
    }

    static public void printArray2D(char[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%c\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }

    static public void printArray2D(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%d\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}

class P {
    int x, y;
    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
