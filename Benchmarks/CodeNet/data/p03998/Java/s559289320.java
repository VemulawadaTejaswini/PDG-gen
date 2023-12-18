import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  Deque<Integer> a = new ArrayDeque<Integer>();
  Deque<Integer> b = new ArrayDeque<Integer>();
  Deque<Integer> c = new ArrayDeque<Integer>();
  int ans;
  int turn = 0;
  boolean win = false;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      read(sc, a);
      read(sc, b);
      read(sc, c);
    } finally {
      sc.close();
    }
  }

  private static void read(Scanner sc, Deque<Integer> a) {
    String s = sc.next();
    int n = s.length();
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'a' ) a.addLast(0);
      if (s.charAt(i) == 'b' ) a.addLast(1);
      if (s.charAt(i) == 'c' ) a.addLast(2);
    }
  }
  
  void solve() {
    while (!win) {
      play();
    }
  }

  void play() {
    if (turn == 0) play_a();
    if (turn == 1) play_b();
    if (turn == 2) play_c();
  }

  void play_a() {
    if (a.size() == 0) {
      win = true;
      ans = 0;
      return;
    }
    turn = a.pollFirst();
  }
  
  void play_b() {
    if (b.size() == 0) {
      win = true;
      ans = 1;
      return;
    }
    turn = b.pollFirst();
  }

  void play_c() {
    if (c.size() == 0) {
      win = true;
      ans = 2;
      return;
    }
    turn = c.pollFirst();
  }

  void show() {
    if (ans == 0) System.out.println("A");
    if (ans == 1) System.out.println("B");
    if (ans == 2) System.out.println("C");
  }
}
