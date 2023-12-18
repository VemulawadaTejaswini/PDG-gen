import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] s = new char[h + 2][w + 2];
    for (int i = 1; i <= h; i++) {
      char[] tmp = sc.next().toCharArray();
      for (int j = 1; j <= w; j++) {
        s[i][j] = tmp[j - 1];
      }
    }
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        int count = 0;
        if (s[i - 1][j - 1] == '#') {
          count++;
        }
        if (s[i - 1][j] == '#') {
          count++;
        }
        if (s[i - 1][j + 1] == '#') {
          count++;
        }
        if (s[i][j - 1] == '#') {
          count++;
        }
        if (s[i][j + 1] == '#') {
          count++;
        }
        if (s[i + 1][j - 1] == '#') {
          count++;
        }
        if (s[i + 1][j] == '#') {
          count++;
        }
        if (s[i + 1][j + 1] == '#') {
          count++;
        }
        if (s[i][j] == '.') {
          s[i][j] = (char)('0' + count);
        }
      }
    }
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        System.out.print(s[i][j]);
        if (j == w) {
          System.out.println();
        }
      }
    }
  }
}