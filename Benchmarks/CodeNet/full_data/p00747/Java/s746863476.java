import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) break;
            int[][] wall = new int[2 * h - 1][w];//y,z
            for (int i = 0; i < 2 * h - 1; i++) {
                for (int j = 0; j < w - (i + 1) % 2; j++) {
                    wall[i][j] = sc.nextInt();
                }
            }
            System.out.println(solve(w, h, wall));
        }
    }

    private static int solve(int w, int h, int[][] wall) {
        Set<Integer> set = new HashSet<>();
        Deque<int[]> que = new ArrayDeque<>();
        int[] state = {0, 0, 1};//x,y
        que.addFirst(state);
        while (!que.isEmpty()) {
            int[] a = que.removeLast();
            if (a[0] == w - 1 && a[1] == h - 1) return a[2];
            if (0 <= a[0] + 1 && a[0] + 1 <= w - 1) {
                if (wall[2 * a[1]][a[0]] == 0) {
                    int[] b = {a[0] + 1, a[1], a[2] + 1};
                    if (!set.contains(getkey(b))) {
                        que.addFirst(b);
                        set.add(getkey(b));
                    }
                }
            }
            if (0 <= a[0] - 1 && a[0] - 1 <= w - 1) {
                if (wall[2 * a[1]][a[0] - 1] == 0) {
                    int[] b = {a[0] - 1, a[1], a[2] + 1};
                    if (!set.contains(getkey(b))) {
                        que.addFirst(b);
                        set.add(getkey(b));
                    }
                }
            }
            if (0 <= a[1] + 1 && a[1] + 1 <= h - 1) {
                if (wall[2 * a[1] + 1][a[0]] == 0) {
                    int[] b = {a[0], a[1] + 1, a[2] + 1};
                    if (!set.contains(getkey(b))) {
                        que.addFirst(b);
                        set.add(getkey(b));
                    }
                }
            }
            if (0 <= a[1] - 1 && a[1] - 1 <= h - 1) {
                if (wall[2 * a[1] - 1][a[0]] == 0) {
                    int[] b = {a[0], a[1] - 1, a[2] + 1};
                    if (!set.contains(getkey(b))) {
                        que.addFirst(b);
                        set.add(getkey(b));
                    }
                }
            }
        }
        return 0;
    }

    private static int getkey(int[] state) {
        return 100 * state[0] + state[1];
    }
}

