import java.util.*;

class Point {
  int x = 0;
  int y = 0;
  
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int line = sc.nextInt();
    int row = sc.nextInt();
    int diff = sc.nextInt();
    HashMap<Integer, Point> map = new HashMap<Integer, Point>();
    for (int i = 0; i < line; i++) {
      for (int j = 0; j < row; j++) {
        map.put(sc.nextInt(), new Point(i,j));
      }
    }
    int test_count = sc.nextInt();
    for (int i = 0; i < test_count; i++) {
      int init_num = sc.nextInt();
      int req_num = sc.nextInt();
      int consume_count = (req_num - init_num) / diff;
      int consume_mp = 0;
      Point current_point = map.get(init_num);
      int current_num = init_num + diff;
      for (int j = 0; j < consume_count; j++) {
        Point next_point = map.get(current_num);
        consume_mp += calc(current_point, next_point);
        current_point = next_point;
        current_num = current_num + diff;
      }
      System.out.println(consume_mp);
    }
  }
  
  static int calc(Point first, Point next) {
    return Math.abs(next.x - first.x) + Math.abs(next.y - first.y);
  }
}