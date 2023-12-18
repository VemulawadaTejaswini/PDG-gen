import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Period {
        int s;
        int e;

        public Period(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    static class Node {
        int h;
        int w;
        int c;

        public Node(int h, int w, int c) {
            this.h = h;
            this.w = w;
            this.c = c;
        }
    }

    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt();
        scanner.nextLine();
        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(0, 0, 0));
        Set<String> visited = new HashSet<>();
        int[][] dirs = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

        int cost = 0;
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n.h == H - 1 && n.w == W - 1) {
                cost = n.c;
                break;
            }
            String s = String.format("%d:%d", n.h, n.w);
            if (visited.contains(s)) {
                continue;
            }
            visited.add(s);
            for (int[] d: dirs) {
                int nh = n.h + d[0];
                int nw = n.w + d[1];
                if (nh >= 0 && nh < H && nw >= 0 && nw < W && grid[nh][nw] == '.') {
                    q.add(new Node(nh, nw, n.c + 1));
                }
            }
        }

        int w = 0;
        for (char[] l: grid)
            for (char n: l)
                if (n == '.') {
                    w++;
                }

        System.out.println(w - cost - 1);
    }

}