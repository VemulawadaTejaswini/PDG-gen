import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int h = scanner.nextInt();
    final int w = scanner.nextInt();
    final char[][] table = new char[h][w];
    for (int i = 0; i < h; i++) table[i] = scanner.next().toCharArray();
    if (possible(table, h, w)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean possible(char[][] table, int h, int w) {
    int[] cindicies = new int[w];
    for (int i = 0; i < w; i++) cindicies[i] = i;
    do {
      boolean valid = true;
      for (int i = 0; i < w / 2; i++) {
        if (cindicies[i] > cindicies[w - i - 1]) {
          valid = false;
          break;
        }
      }
      if (!valid) continue;

      if (check(table, h, w, cindicies)) return true;
    } while (nextPerm(cindicies));

    return false;
  }

  private static boolean check(char[][] table, int h, int w, int[] c) {
    List<char[]> rows = new ArrayList<>();
    for (int i = 0; i < h; i++) rows.add(table[i]);
    char[] rem = null;
    while (rows.size() > 1) {
      char[] row = rows.remove(0);
      boolean found = false;
      for (int i = 0; i < rows.size(); i++) {
        char[] other = rows.get(i);
        boolean symmetry = true;
        for (int j = 0; j < w / 2; j++) {
          if (row[c[j]] != other[c[w - j - 1]]) {
            symmetry = false;
            break;
          }
        }
        if (symmetry) {
          rows.remove(i);
          found = true;
          break;
        }
      }
      if (!found) {
        if (rem == null) rem = row;
        else return false;
      }
    }
    if (rem == null) return true;
    for (int i = 0; i < w / 2; i++) {
      if (rem[c[i]] != rem[c[w - i - 1]]) return false;
    }
    return true;
  }

  private static boolean nextPerm(int[] a) {
    int i = a.length - 1;
    while (i > 0 && a[i - 1] >= a[i]) i--;
    if (i == 0) return false;

    int j = a.length - 1;
    while (j >= i && a[j] <= a[i - 1]) j--;

    swap(a, i - 1, j);

    j = a.length - 1;
    while (i < j) swap(a, i++, j--);
    return true;
  }

  private static void swap(int[] a, int i, int j) {
    int tmp = a[j];
    a[j] = a[i];
    a[i] = tmp;
  }
}
