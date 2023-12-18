import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  private void solve(Scanner in, PrintWriter out) {
    int N = in.nextInt();
    int count = 0;
    for (int i = 0; i < N; i++) {
      int a = in.nextInt();
      if (a % 2 == 1) {
        count++;
      }
    }
    if (count % 2 == 0) {
      out.println("YES");
    } else {
      out.println("NO");
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    in.close();
    out.close();
  }
}
