import java.awt.Point;
import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt(), w = scanner.nextInt();
        long ans = 0;
        char[][] c = IntStream.range(0, h).mapToObj(i -> scanner.next().toCharArray()).toArray(char[][]::new);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (c[i][j] != '\0') {
                    long bl = 0, wh = 0;
                    Deque<Point> deque = new ArrayDeque<>(Collections.singleton(new Point(i, j)));
                    while (!deque.isEmpty()) {
                        Point p = deque.pollLast();
                        char ch = c[p.x][p.y];
                        if (ch == '\0') continue;
                        else if (ch == '#') bl++;
                        else if (ch == '.') wh++;
                        c[p.x][p.y] = '\0';
                        if (p.x > 0 && ch != c[p.x - 1][p.y])
                            deque.push(new Point(p.x - 1, p.y));
                        if (p.x + 1 < h && ch != c[p.x + 1][p.y])
                            deque.push(new Point(p.x + 1, p.y));
                        if (p.y > 0 && ch != c[p.x][p.y - 1])
                            deque.push(new Point(p.x, p.y - 1));
                        if (p.y + 1 < w && ch != c[p.x][p.y + 1])
                            deque.push(new Point(p.x, p.y + 1));
                    }
                    ans += bl * wh;
                }
            }
        }
        System.out.println(ans);
    }
}