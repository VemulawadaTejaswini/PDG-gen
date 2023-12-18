import java.util.*;
import java.util.stream.*;
// import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int[] a = scanner.next().chars().map(c -> c - '0').toArray();
      String[] ops = {
        "+++",
        "++-",
        "+-+",
        "+--",
        "-++",
        "-+-",
        "--+",
        "---",
      };
      for (String op: ops) {
        if (solve(a,op) == 7) {
          show(a,op);
          return;
        }
      }
    } finally {
      scanner.close();
    }
  }
  
  private static int solve(int[] a, String op) {
    int ans = a[0];
    for (int i = 0; i < 3; i++) {
      switch(op.charAt(i)) {
        case '+':
          ans += a[i+1];
          break;

        case '-':
          ans -= a[i+1];
      }
    }
    return ans;
  }

  private static void show(int[] a, String op) {
    for (int i = 0; i < 4; i++) {
      System.out.print(a[i]);
      if (i != 3) System.out.print(op.charAt(i)); 
    }
    System.out.println("=7");
  }
}
