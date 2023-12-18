import java.io.*;
import java.util.*;

public class Main {
    private static List<Point> list = new ArrayList<>();
    private static Map<Integer, List<Point>> map = new HashMap<>();
    private static Map<Integer, Set<Integer>> map2 = new HashMap<>();
    private static int cnt;
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[M];
        int[] b = new int[M];
        for (int i = 0; i < M; ++i) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            Point p = new Point(a[i], b[i]);
            list.add(p);
            add(p);
        }
        cnt = list.size();

        for (int i = 0; i < list.size(); ++i) {
            Point p1 = list.get(i);
            List<Point> l = map.get(p1.b);
            if (l != null) {
                for (int j = 0; j < l.size(); ++j) {
                    Point p2 = l.get(j);
                    paint(p1, p2);
                }
            }
        }

        System.out.println(cnt);
    }
    private static void add(Point p) {
        List<Point> l = map.get(p.a);
        if (l == null) {
            l = new ArrayList<>();
            map.put(p.a, l);
        }
        l.add(p);

        Set<Integer> s = map2.get(p.a);
        if (s == null) {
            s = new HashSet<>();
            map2.put(p.a, s);
        }
        s.add(p.b);
    }
    private static void paint(Point p1, Point p2) {
        if (board(p1.a, p1.b) && board(p2.a, p2.b) && !board(p2.b, p1.a)) {
            ++cnt;

            Point p3 = new Point(p2.b, p1.a);
            list.add(p3);
            add(p3);
        }
    }
    private static boolean board(int a, int b) {
        Set<Integer> s1 = map2.get(a);
        if (s1 != null) {
            if (s1.contains(b)) {
                return true;
            }
//          for (Point p : s1) {
//              if (p.a == a && p.b == b) {
//                  return true;
//              }
//          }
        }
//      List<Point> l2 = map.get(b);
//      if (l2 != null) {
//          for (Point p : l2) {
//              if (p.a == a && p.b == b) {
//                  return true;
//              }
//          }
//      }
        return false;
    }
    private static class Point {
        public int a;
        public int b;
        public Point(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public String toString() {
            return "(" + this.a + ", " + this.b + ")";
        }
    }
}