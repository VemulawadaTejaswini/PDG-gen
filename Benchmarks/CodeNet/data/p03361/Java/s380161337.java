import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char s[][] = new char[h+2][w+2];

    for (int i = 1; i <= h; i++) {
      String line = sc.next();
      for (int j = 1; j <= w; j++) {
        s[i][j] = line.charAt(j-1);
      }
    }

    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        if (s[i][j] == '#') {
          if (s[i-1][j] == '#') continue;
          if (s[i+1][j] == '#') continue;
          if (s[i][j-1] == '#') continue;
          if (s[i][j+1] == '#') continue;
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");

  }

}
