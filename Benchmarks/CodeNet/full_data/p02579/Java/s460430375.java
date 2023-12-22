import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int ch = scanner.nextInt() - 1;
        int cw = scanner.nextInt() - 1;
        int dh = scanner.nextInt() - 1;
        int dw = scanner.nextInt() - 1;

        char[][] s = new char[h][];
        Arrays.setAll(s, i -> scanner.next().toCharArray());

        // 上下左右（分岐先）の座標を配列に入れておくと、forループで回して処理できるので便利
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int[][] count = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(count[i], Integer.MAX_VALUE);
        }

        long ans = Long.MAX_VALUE;

        Deque<MyPoint> stack = new ArrayDeque<>();
        stack.addFirst(new MyPoint(cw, ch, 0));
        while (!stack.isEmpty()) {
            MyPoint p = stack.removeFirst(); // 先頭の座標を取得後、削除
            if (p.x == dw && p.y == dh) {
                ans = Math.min(p.count, ans);
                continue;
            }
            for (int k = 0; k < 4; k++) {
                int x = p.x + dx[k];
                int y = p.y + dy[k];

                // 分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
                if (x >= 0 && x < w && y >= 0 && y < h) {
                    if (s[y][x] == '.' && count[y][x] > p.count) {
                        stack.add(new MyPoint(x, y, p.count));
                        count[y][x] = p.count;
                    }
                }
            }
            p.count++;
            // ワープを使う場合のループ
            for (int k = 0; k < 5; k++) {
                for (int i = 0; i < 5; i++) {
                    int x = p.x - 2 + i;
                    int y = p.y - 2 + k;

                    // 分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
                    if (x >= 0 && x < w && y >= 0 && y < h) {
                        if (s[y][x] == '.' && count[y][x] > p.count) {
                            stack.add(new MyPoint(x, y, p.count));
                            count[y][x] = p.count;
                        }
                    }
                }
            }
        }

        System.out.println(ans == Long.MAX_VALUE ? -1 : ans);
    }

    private static class MyPoint {
        private int x;
        private int y;
        private int count;

        public MyPoint(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}