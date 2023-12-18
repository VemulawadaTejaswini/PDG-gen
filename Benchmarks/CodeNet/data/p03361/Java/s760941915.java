import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    boolean[][] s = new boolean[H][W];
    String line;
    for (int i=0; i<H; i++) {
      line = sc.next();
      for (int j=0; j<W; j++) {
        s[i][j] = (line.charAt(j) == '#');
      }
    }

    boolean ret = true;
    for (int i=0; i<H; i++) {
      for (int j=0; j<W; j++) {
        if (s[i][j]) {
          if (i>0 && s[i-1][j]) {
            continue;
          }
          if (j>0 && s[i][j-1]) {
            continue;
          }
          if (i<H-1 && s[i+1][j]) {
            continue;
          }
          if (j<W-1 && s[i][j+1]) {
            continue;
          }
          // failed.
          ret = false;
          i = H;
          j = W;
        }
      }
    }
    String ans;
    if (ret) {
      ans = "Yes";
    } else {
      ans = "No";
    }
    System.out.println(ans);
  }
}
