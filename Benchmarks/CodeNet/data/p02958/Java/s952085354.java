import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    for (int i = 0; i < N; i++) {
      if (list.get(i) != i + 1) {
        cnt++;
      }
    }
    if (cnt <= 2) {
      System.out.println("YES");
    } else {
      System.out.println("No");
    }
  }
}
