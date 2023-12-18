import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static int H, W;
    static char[][] m;
    static void solve(Scanner scanner) {
        H = Integer.parseInt(scanner.next());
        W = Integer.parseInt(scanner.next());
        m = new char[H][W];
        for (int i = 0; i < H; i++) {
            m[i] = scanner.next().toCharArray();
        }

        Set<Integer> visited = new HashSet<>();
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                for (int i2 = 0; i2 < H; i2++) {
                    for (int j2 = 0; j2 < W; j2++) {
                        if (visited.add(i * 1000000 + j * 10000 + i2 * 100 + j2) ||
                                visited.add(i2 * 1000000 + j2 * 10000 + i * 100 + j)) {
                            if (Math.abs(i - i2) + Math.abs(j - j2) <= max) {
                                continue;
                            }
                            int res = bfs(i, j, i2, j2);
                            if (res >= 0) {
                                max = Math.max(max, res);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }

    static int bfs(int sy, int sx, int ey, int ex) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(sy * 100 + sx);
        q.add(null);
        int d = 0;

        while (!q.isEmpty()) {
            Integer top = q.poll();
            if (top == null) {
                d++;
                if (q.peek() == null) {
                    break;
                }
                q.add(null);
                continue;
            }
            int y = top / 100;
            int x = top % 100;
            if (x < 0 || x >= W || y < 0 || y >= H || m[y][x] == '#') {
                continue;
            }
            if (y == ey && x == ex) {
                return d;
            }
            if (visited.add(top)) {
                q.add((y + 1) * 100 + x);
                q.add((y - 1) * 100 + x);
                q.add(y * 100 + x + 1);
                q.add(y * 100 + x - 1);
            }
        }

        return -1;
    }

}

