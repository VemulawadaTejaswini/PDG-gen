import java.util.*;

public class Main{

    static class Point {
        int hh;
        int ww;
        public Point (int hh, int ww) {
            this.hh = hh;
            this.ww = ww;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for(int i = 0; i < h; i++){
            s[i]  = sc.next().toCharArray();
        }
        sc.close();
        int count = 0;
        
        ArrayDeque<Point> queue = new ArrayDeque<>();
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(s[i][j] == '#'){
                    queue.add(new Point(i, j));
                }
            }
        }

        ArrayDeque<Point> queue2 = new ArrayDeque<>();

        while (queue.size() > 0) {
            while (queue.size() > 0) {
               Point p = queue.poll();
                if (p.hh != 0 && s[p.hh-1][p.ww] == '.') {
                    s[p.hh-1][p.ww] = '#';
                    queue2.add(new Point(p.hh - 1, p.ww));
                }
                if (p.hh != h - 1 && s[p.hh+1][p.ww] == '.') {
                    s[p.hh+1][p.ww] = '#';
                    queue2.add(new Point(p.hh + 1, p.ww));
                }
                if (p.ww != 0 && s[p.hh][p.ww-1] == '.') {
                    s[p.hh][p.ww-1] = '#';
                    queue2.add(new Point(p.hh, p.ww - 1));
                }
                if (p.ww != w - 1 && s[p.hh][p.ww+1] == '.') {
                    s[p.hh][p.ww+1] = '#';
                    queue2.add(new Point(p.hh, p.ww + 1));
                }
            }
            if (queue2.size() == 0) {
                break;
            }
            count++;
            ArrayDeque<Point> tmp = queue2;
            queue2 = queue;
            queue = tmp;
            
       }
       System.out.println(count);

    }
}