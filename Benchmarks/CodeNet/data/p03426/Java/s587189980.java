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

    static class Pos {
        int h;
        int w;

        Pos(int h, int w) {
            this.h = h;
            this.w = w;
        }

        int diff(Pos other) {
            return Math.abs(h - other.h) + Math.abs(w - other.w);
        }
    }

    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt(), D = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, Pos> m = new HashMap<>();
        for (int h = 0; h < H; h++){
            for (int w = 0; w < W; w++) {
                int n = scanner.nextInt();
                m.put(n, new Pos(h, w));
            }
        }
        scanner.nextLine();

        int[][] dist = new int[H * W + 1][H * W + 1];
        for (int i = 0; i < H * W + 1; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE / 2);
            dist[i][i] = 0;
        }
        for (int i = 1; i + D < H * W + 1; i++) {
            dist[i][i + D] = m.get(i).diff(m.get(i + D));
        }

        for (int v = 1; v < H * W + 1; v++)
            for (int f = 1; f < H * W + 1; f++)
                for (int t = 1; t < H * W + 1; t++)
                    if (dist[f][t] > dist[f][v] + dist[v][t]) {
                        dist[f][t] = dist[f][v] + dist[v][t];
                    }

        int Q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(dist[q[0]][q[1]]);
        }
    }

}