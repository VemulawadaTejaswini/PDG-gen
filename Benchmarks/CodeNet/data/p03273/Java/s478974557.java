import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int h = scanner.nextInt();
      int w = scanner.nextInt();
      String[] s = new String[h];
      for (int i = 0; i < h; i++) {
        s[i] = scanner.next();
      }

      boolean[] row = new boolean[h];
      boolean[] col = new boolean[w];

      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (s[i].charAt(j) == '#') {
            row[i] = true;
            col[j] = true;
          }
        }
      }

      for (int i = 0; i < h; i++) {
        if (!row[i]) continue;
        for (int j = 0; j < w; j++) {
          if (!col[j]) continue;
          System.out.print(s[i].charAt(j));
        }
        System.out.println("");
      }
    } finally {
      scanner.close();
    }
  }
}
