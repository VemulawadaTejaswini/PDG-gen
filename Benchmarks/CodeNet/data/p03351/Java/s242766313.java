import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

  private static final Scanner in = new Scanner(System.in);
  private static final PrintWriter out = new PrintWriter(System.out);

  private static int[] nextArray(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    return arr;
  }

  public static void main(String[] args) {
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    solve(a, b, c, d);
    out.flush();
    out.close();
  }

  private static void solve(int a, int b, int c, int d) {
    if (Math.abs(a - c) <= d) {
      out.println("Yes");
      return;
    }
    if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
      out.println("Yes");
      return;
    }
    out.println("No");
  }


}