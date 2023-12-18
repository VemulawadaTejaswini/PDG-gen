import java.util.*;

public class Main {

  public static class Pair {
    int y;
    int x;
    int a;

    public Pair(int y, int x, int a) {
      this.y = y;
      this.x = x;
      this.a = a;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] a = new int[500][500];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    Pair[] root = new Pair[25000];
    int count = 0;
    int sy = 0;
    int sx = 0;
    boolean left = true;
    while (count < H * W) {
      if (W <= sx) {
        sx--;
        sy++;
        left = false;
      } else if (sx < 0) {
        sx++;
        sy++;
        left = true;
      }
      root[count] = new Pair(sy, sx, a[sy][sx]);
      if (left) {
        sx++;
      } else {
        sx--;
      }
      count++;
    }
    ArrayList<Pair> from = new ArrayList<>();
    ArrayList<Pair> to = new ArrayList<>();
    for (int i = 0; i < H * W - 1; i++) {
      if (root[i].a % 2 == 1) {
        root[i + 1].a++;
        from.add(root[i]);
        to.add(root[i + 1]);
      }
    }
    System.out.println(from.size());
    for (int i = 0; i < from.size(); i++) {
      System.out
          .println((from.get(i).y + 1) + " " + (from.get(i).x + 1) + " " + (to.get(i).y + 1) + " " + (to.get(i).x + 1));
    }
  }
}