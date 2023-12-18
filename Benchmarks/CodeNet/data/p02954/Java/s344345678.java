import java.util.Scanner;

public class Main {
  private static void solve(String s) {
    int count = 0;
    int n = s.length();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'R') {
        count++;
        continue;
      }
      a[i] += count / 2;
      a[i - 1] += count - count / 2;
      count = 0;
    }
    count = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == 'L') {
        count++;
        continue;
      }
      a[i] += count / 2;
      a[i + 1] += count - count / 2;
      count = 0;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i > 0) sb.append(" ");
      sb.append(a[i]);
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    solve(s);
  }
}