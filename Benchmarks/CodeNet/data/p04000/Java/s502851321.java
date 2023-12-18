import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        HashMap<Point, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int hh = sc.nextInt();
            int ww = sc.nextInt();
            for (int a = Math.max(hh - 2, 1); a <= hh && a + 2 <= h; a++) {
                for (int b = Math.max(ww - 2, 1); b <= ww && b + 2 <= w; b++) {
                    Point p = new Point(a, b);
                    if (map.containsKey(p)) {
                        map.put(p, map.get(p) + 1);
                    } else {
                        map.put(p, 1);
                    }
                }
            }
        }
        long[] ans = new long[10];
        for (int x : map.values()) {
            ans[x]++;
        }
        ans[0] = (long)(h - 2) * (w - 2) - map.size();
        StringBuilder sb = new StringBuilder();
        for (long x : ans) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Point {
        int height;
        int width;
        
        public Point (int height, int width) {
            this.height = height;
            this.width = width;
        }
        
        public int hashCode() {
            return height;
        }
        
        public boolean equals(Object o) {
            Point p = (Point) o;
            return height == p.height && width == p.width;
        }
        
        public String toString() {
            return height + ":" + width;
        }
    }
}