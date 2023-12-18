import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int map[][] = new int[101][101];
    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      int h = Integer.parseInt(sc.next());
      map[x][y] = h;
    }

    int Cx = -1, Cy = -1, H = 0;

    for (int i = 0; i < 101; i++) {
      if (Cx >= 0 && Cy >= 0) {
        break;
      }
      for (int j = 0; j < 101; j++) {
        if (map[i][j] > 0) {
          int h1 = map[i][j];
          for (int y = j + 1; y < 101; y++) {
            if (map[i][y] > 0) {
              int h2 = map[i][y];
              if (h1 == h2) {
                Cy = (j + y) / 2;
                map[i][Cy] = h1 + Cy - j;
                for (int k = Cy - 1; k >= 0; k--) {
                  map[i][k] = Math.max(0, map[i][Cy] - (Cy - k));
                }
                for (int k = Cy + 1; k < 101; k++) {
                  map[i][k] = Math.max(0, map[i][Cy] - (k - Cy));
                }
                break;
              }
              // 下がり
              if (h1 - h2 == y - j) {
                for (int k = j + 1; k < 101; k++) {
                  map[i][k] = Math.max(0, h1 - (k - j));
                }
                break;
              } else if (h2 - h1 == y - j) {
                for (int k = y - 1; k >= 0; k--) {
                  map[i][k] = Math.max(0, h2 - (y - k));
                }
              } else {
                for (int k = j - 1; k >= 0; k--) {
                  map[i][k] = Math.max(0, h1 - (j - k));
                }
              }
            }
          }

          for (int x = i + 1; x < 101; x++) {
            if (map[x][j] > 0) {
              int h2 = map[x][j];
              if (h1 == h2) {
                Cx = (i + x) / 2;
                map[Cx][j] = h1 + Cx - i;
                for (int k = Cx - 1; k >= 0; k--) {
                  map[k][j] = Math.max(0, map[Cx][j] - (Cx - k));
                }
                for (int k = Cx + 1; k < 101; k++) {
                  map[k][j] = Math.max(0, map[Cx][j] - (k - Cx));
                }
                break;
              }
              // 下がり
              if (h1 - h2 == x - i) {
                for (int k = i + 1; k < 101; k++) {
                  map[k][j] = Math.max(0, h1 - (k - i));
                }
                break;
              } else if (h2 - h1 == x - i) {
                for (int k = x - 1; k >= 0; k--) {
                  map[k][j] = Math.max(0, h2 - (x - k));
                }
              } else {
                for (int k = i - 1; k >= 0; k--) {
                  map[k][j] = Math.max(0, h1 - (i - k));
                }
              }
            }
          }
        }
      }
    }

    for (int i = 0; i < 101; i++) {
      for (int j = 0; j < 101; j++) {
        System.out.print(map[j][i] + " ");
      }
      System.out.println();
    }

    if (map[0][1] == map[1][0] && map[0][1] - map[1][1] == 1) {
      System.out.println("0 0 " + (map[0][1] + 1));
      return;
    }
    if (map[0][99] == map[1][100] && map[0][99] - map[1][99] == 1) {
      System.out.println("0 100 " + (map[0][99] + 1));
      return;
    }
    if (map[99][0] == map[100][1] && map[99][0] - map[99][1] == 1) {
      System.out.println("100 0 " + (map[99][0] + 1));
      return;
    }
    if (map[99][100] == map[100][99] && map[99][100] - map[99][99] == 1) {
      System.out.println("100 100 " + (map[99][100] + 1));
      return;
    }

    if (Cx >= 0 && Cy >= 0) {
      H = map[Cx][Cy];
    } else {
      int x = Cx, y = Cy;
      for (int i = 0; i < 101; i++) {
        for (int j = 0; j < 101; j++) {
          if (map[i][j] > H) {
            x = i;
            y = j;
            H = map[i][j];
          }
        }
      }
      Cx = x;
      Cy = y;
    }
    System.out.println(Cx + " " + Cy + " " + H);
  }
}