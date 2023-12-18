import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int N = ni();
    int L = ni();
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < N; ++i) {
      list.add(sc.nextLine());
    }
    Collections.sort(list);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; ++i) {
      sb.append(list.get(i));
    }
    System.out.println(sb.toString());
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}