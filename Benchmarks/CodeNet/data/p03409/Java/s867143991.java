import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Point[] reds = new Point[n];
    Point[] blues = new Point[n];
    for(int i = 0; i < n; i++) reds[i] = new Point(sc.nextInt(), sc.nextInt());
    for(int i = 0; i < n; i++) blues[i] = new Point(sc.nextInt(), sc.nextInt());
    Arrays.sort(reds, (r1, r2) -> r2.getY() - r1.getY());
    Arrays.sort(blues, (b1, b2) -> b1.getX() - b2.getX());
    int count = 0;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(blues[i] == null || reds[j] == null) continue;
        if(reds[j].getX() < blues[i].getX() && reds[j].getY() < blues[i].getY()) {
          count++;
          reds[j] = null;
          blues[i] = null;
          break;
        }
      }
    }
    System.out.println(count);
  }
  static class Point {
    int x;
    int y;
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    public int getX() {
      return this.x;
    }
    public int getY() {
      return this.y;
    }
  }
}