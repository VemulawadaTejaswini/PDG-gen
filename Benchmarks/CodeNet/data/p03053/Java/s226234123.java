import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] field = new char[h][];
        ArrayDeque<Point> queue = new ArrayDeque<Point>();
        
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (field[i][j] == '#') {
                    queue.add(new Point(i, j));
                }
            }
        }
        int count = 0;
        ArrayDeque<Point> next = new ArrayDeque<Point>();
        while (queue.size() > 0) {
            while (queue.size() > 0) {
               Point p = queue.poll();
                if (p.hh != 0 && field[p.hh - 1][p.ww] == '.') {
                    field[p.hh - 1][p.ww] = '#';
                    next.add(new Point(p.hh - 1, p.ww));
                }
                if (p.hh != h - 1 && field[p.hh + 1][p.ww] == '.') {
                    field[p.hh + 1][p.ww] = '#';
                    next.add(new Point(p.hh + 1, p.ww));
                }
                if (p.ww != 0 && field[p.hh][p.ww - 1] == '.') {
                    field[p.hh][p.ww - 1] = '#';
                    next.add(new Point(p.hh, p.ww - 1));
                }
                if (p.ww != w - 1 && field[p.hh][p.ww + 1] == '.') {
                    field[p.hh][p.ww + 1] = '#';
                    next.add(new Point(p.hh, p.ww + 1));
                }
            }
            if (next.size() == 0) {
                break;
            }
            ArrayDeque<Point> tmp = next;
            next = queue;
            queue = tmp;
            count++;
       }
       System.out.println(count);
    }
    
    static class Point {
        int hh;
        int ww;
        public Point (int hh, int ww) {
            this.hh = hh;
            this.ww = ww;
        }
        
        public String toString() {
            return hh + ":" + ww;
        }
    }
}
