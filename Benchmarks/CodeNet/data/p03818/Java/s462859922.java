import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  private void solve(Scanner in, PrintWriter out) {
    int N = in.nextInt();
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < N; i++) {
      set.add(in.nextInt());
    }

    int lost = N - set.size();
    if (lost % 2 == 1) {
      lost++;
    }
    out.println(N - lost);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    in.close();
    out.close();
  }
}
