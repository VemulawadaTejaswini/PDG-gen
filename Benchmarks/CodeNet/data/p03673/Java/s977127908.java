import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  int a[];
  boolean rev;
  Deque<Integer> deq = new ArrayDeque<Integer>();
  int ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) deq.addLast(a[i]);
      else deq.addFirst(a[i]);
    }
  }

  void show() {
    if (n % 2 == 0) showForward();
    else showReverse();
  }

  void showForward() {
    for (int i = 0; i < n; i++) {
      ans = deq.pollFirst();
      System.out.print(ans);
      if (i != n - 1) System.out.print(" ");
    }
    System.out.println("");
  }

  void showReverse() {
    for (int i = 0; i < n; i++) {
      ans = deq.removeLast();
      System.out.print(ans);
      if (i != n - 1) System.out.print(" ");
    }
    System.out.println("");
  }
}
