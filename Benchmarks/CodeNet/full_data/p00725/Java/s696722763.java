import java.util.*;

class Curling {
    private final static int[] dy = {-1, 0, 1, 0};
    private final static int[] dx = {0, 1, 0, -1};
    private static int w, h;
    private static int[][] field;
    static boolean isFound;
    private HashSet<Integer> set = new HashSet<>();

    LinkedList<Curling> ret = new LinkedList<>();
    int y, x, steps;

    Curling(int _w, int _h, int[][] _field, int _y, int _x, int _steps) {
        w = _w;
        h = _h;
        field = new int[h][w];
        for (int i=0; i<h; i++) System.arraycopy(_field[i], 0, field[i], 0, w);
        y = _y;
        x = _x;
        steps = _steps;
        isFound = false;
    }

    private Curling(int[][] _field, int breakHash, int _y, int _x, int _steps) {
        field = new int[h][w];
        for (int i=0; i<h; i++) System.arraycopy(_field[i], 0, field[i], 0, w);
        set.add(breakHash);
        y = _y;
        x = _x;
        steps = _steps;
    }

    @Override
    public int hashCode() { return y*h+x; }

    LinkedList<Curling> nextStep() {
        ret.clear();
        if (isFound) return ret;
        if (steps == 10) return ret;

        int nowY, nowX;
        for (int i=0; i<4; i++) {
            nowY = y+dy[i];
            nowX = x+dx[i];
            if (nowY < 0 || nowY >= h || nowX < 0 || nowX >= w) continue;
            if (field[nowY][nowX] == 1 && !set.contains(nowY*h+nowX)) continue;
            if (field[nowY][nowX] == 3) {
                isFound = true;
                System.out.println(steps+1);
                break;
            }
            while (true) {
                nowY += dy[i];
                nowX += dx[i];
                if (nowY < 0 || nowY >= h || nowX < 0 || nowX >= w) break;
                if (field[nowY][nowX] % 2 == 1) break;
            }
            if (nowY < 0 || nowY >= h || nowX < 0 || nowX >= w) continue;
            if (field[nowY][nowX] == 1 && !set.contains(nowY*h+nowX)) {
                ret.add(new Curling(field, nowY*h+nowX, nowY-dy[i], nowX-dx[i], steps+1));
            }
            if (field[nowY][nowX] == 3) {
                isFound = true;
                System.out.println(steps+1);
                break;
            }
        }

        return ret;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Curling> queue = new LinkedList<>();

        int w, h, startY, startX;
        int[][] field;

        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0) break;

            field = new int[h][w];
            startY = 0;
            startX = 0;
            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    field[i][j] = sc.nextInt();
                    if (field[i][j] == 2) {
                        startY = i;
                        startX = j;
                    }
                }
            }

            Curling startCurling = new Curling(w, h, field, startY, startX, 0);

            queue.add(startCurling);

            while (!queue.isEmpty()) {
                Curling nowCurling = queue.poll();

                for (Curling nextCurling : nowCurling.nextStep()) {
                    queue.add(nextCurling);
                }
            }
            if (!Curling.isFound) System.out.println(-1);
        }
    }
}