import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static int h, w;
    static char[][] S;

    public static void main(String[] args) {
        input();
        solve();
    }

    static void solve() {
        int ans = 0;

        Queue<P> q = new ArrayDeque<>();
        q.add(new P(0, 0));
        int[][] cost = new int[h][w];
        for(int i = 0; i < h; i++) Arrays.fill(cost[i], -1);
        cost[0][0] = 1;
        while(!q.isEmpty()) {
            P c = q.remove();

            for(int i = 0; i < 4; i++) {
                int nx = c.x + x4[i];
                int ny = c.y + y4[i];
                if(nx < 0 || w-1 < nx || ny < 0 || h-1 < ny) continue;
                if(cost[ny][nx] != -1 || S[ny][nx] != '.') continue;

                cost[ny][nx] = cost[c.y][c.x] + 1;
                S[ny][nx] = '@';
                q.add(new P(nx, ny));
            }
        }

        if(cost[h-1][w-1] == -1) {
            print(-1);
            return;
        }

        int cnt = 0;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(S[i][j] == '#') cnt++;
            }
        }

        ans = w * h - cnt - cost[h-1][w-1];
        print(ans);
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        h = in.nextInt();
        w = in.nextInt();
        S = new char[h][w];
        for(int i = 0; i < h; i++) {
            S[i] = in.next().toCharArray();
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(char c) {
        System.out.println(c);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }

    static void printArray2D(int[][] array, char del) {
        int r = array.length;
        int c = array[0].length;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.format("%3d", array[i][j]);
                if(j != c-1) System.out.print(del);
                else System.out.print('\n');
            }
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

class E {
    int from, to;
    long w;
    E(int from, int to, long w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }
}
