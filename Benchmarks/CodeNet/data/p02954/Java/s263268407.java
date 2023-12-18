import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] S = in.nextLine().toCharArray();
    int[] ans = new int[S.length];
    int l = 0;
    while (l < S.length) {
      int r = l + 1;
      while (r < S.length && S[r] == 'R') {
        r++;
      }
      int firstL = r;
      while (r < S.length && S[r] == 'L') {
        r++;
      }
      for (int i = l; i < r; i++) {
        int d = Math.abs(r - i);
        ans[firstL - d % 2]++;
      }
      // RRLLLL RL RRLL
      //System.out.println(l + " " + (r - 1) + " " + firstL);
      l = r;
    }
    show(ans);
  }

  public static void show(int[] ans) {
    for (int i = 0; i < ans.length; i++) {
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(ans[i]);
    }
    System.out.println();
  }
}
