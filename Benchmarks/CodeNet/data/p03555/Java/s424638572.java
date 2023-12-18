import java.util.*;

class Reader {
  Scanner sc = new Scanner(System.in);

  public int ini() {
    return sc.nextInt();
  }

  public String ins() {
    return sc.next();
  }

  public String insl() {
    return sc.nextLine();
  }

  public void skip() {
    sc.nextLine();
  }

  public int[] vi(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    return a;
  }

  public long[] vl(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextLong();
    return a;
  }

  public String[] vsl(int n) {
    String[] a = new String[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextLine();
    return a;
  }
}

public class Main extends Reader {
  public static void main(String[] args) {
    Main main = new Main();
    main.show(main.solve());
  }

  String s;
  String t;

  public Main() {
    s = ins();
    t = ins();
  }
  
  int solve() {
    int ans = 1;
    for (int i = 0; i < 3; i++) {
      if (s.charAt(i) != t.charAt(2-i)) ans = 0;
    }
    return ans;
  }

  void show(int ans) {
    System.out.println(ans == 1 ? "YES" : "NO");
  }
}