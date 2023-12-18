import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int D = scanner.nextInt();

    List<Cell> cells = new ArrayList<>();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int a = scanner.nextInt();
        cells.add(new Cell(i, j, a));
      }
    }
    Collections.sort(cells);

    int[][] acc = new int[D][H * W / D + 1];
    for (int i = 0; i < D; i++) {
      int sum = 0;
      Cell prev = null;
      for (int j = i; j < cells.size(); j += D) {
        Cell c = cells.get(j);
        if (prev != null) sum += Math.abs(c.x - prev.x) + Math.abs(c.y - prev.y);
        acc[(i + 1) % D][j / D] = sum;
        prev = c;
      }
    }

    int Q = scanner.nextInt();
    for (int i = 0; i < Q; i++) {
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      System.out.println(acc[r % D][(r - 1) / D] - acc[l % D][(l - 1) / D]);
    }
  }

  private static class Cell implements Comparable<Cell> {
    public final int x;
    public final int y;
    public final int num;

    private Cell(int x, int y, int num) {
      this.x = x;
      this.y = y;
      this.num = num;
    }

    @Override public int compareTo(Cell o) {
      return num - o.num;
    }
  }
}
