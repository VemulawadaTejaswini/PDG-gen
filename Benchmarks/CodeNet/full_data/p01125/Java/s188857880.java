import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int n = sc.nextInt();

      if(n == 0) break;

      final Field field = new Field();

      for(int i = 0; i < n; i++) {
        field.setGem(sc.nextInt(), sc.nextInt());
      }

      final int m = sc.nextInt();

      int x = 10;
      int y = 10;

      int gems = 0;

      for(int i = 0; i < m; i++) {
        final String d = sc.next();
        final int l = sc.nextInt();

        if(d.equals("N")) {
          gems += field.takeGems_y(y, y + l, x);
          y += l;
        }
        else if(d.equals("E")) {
          gems += field.takeGems_x(x, x + l, y);
          x += l;
        }
        else if(d.equals("S")) {
          gems += field.takeGems_y(y, y - l, x);
          y -= l;
        }
        else if(d.equals("W")) {
          gems += field.takeGems_x(x, x - l, y);
          x -= l;
        }
      }

      if(gems == n) System.out.println("Yes");
      else System.out.println("No");
    }
  }

  private final Scanner sc = new Scanner(System.in);
}

class Field {
  public Field() {
    this.map = new boolean[21][21];
    for(int i = 0; i <= 20; i++) {
      for(int j = 0; j <= 20; j++) {
        map[i][j] = false;
      }
    }
  }

  public void setGem(int x, int y) {
    map[x][y] = true;
  }

  public int takeGems_x(int x1, int x2, int y) {
    int gems = 0;

    final int from = Math.min(x1, x2);
    final int to = Math.max(x1, x2);

    for(int i = from; i <= to; i++) {
      if(map[i][y]) {
        gems++;
        map[i][y] = false;
      }
    }

    return gems;
  }

  public int takeGems_y(int y1, int y2, int x) {
    int gems = 0;

    final int from = Math.min(y1, y2);
    final int to = Math.max(y1, y2);

    for(int i = from; i <= to; i++) {
      if(map[x][i]) {
        gems++;
        map[x][i] = false;
      }
    }

    return gems;
  }

  private boolean[][] map;
}