import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static class Pair {
    int left;
    int right;

    Pair(int l, int r) {
      left = l;
      right = r;
    }
  }

  public static void main(String[] args) {
    Scanner std = new Scanner(System.in);
    int n = std.nextInt();
    int m = std.nextInt();
    //    int[][] dp = new int[n + 10][2];
    Map<Integer, Pair> map = new HashMap<>();
    for (int i = 0; i < m; i++) {
      int number = std.nextInt();
      String res = std.next();
      int resValue = (res.equals("AC")) ? 1 : 0;
      Pair p = map.getOrDefault(number, new Pair(0, 0));
      if (resValue == 0 && p.left != 1) {
        p.right++;
      } else {
        p.left = 1;
      }

      map.put(number, p);
    }
    int correctCount = 0;
    int wrongCount = 0;
    for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
      Pair p = entry.getValue();
      if (p.left == 1) {
        correctCount++;
        wrongCount += p.right;
      }
    }

    String ans = correctCount + " " + wrongCount;
    System.out.println(ans);
  }
}
