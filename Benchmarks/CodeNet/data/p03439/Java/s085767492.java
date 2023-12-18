import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int lo = 0;
    int hi = N;
    int base = query(0);
    for (int i = 1; i < 20; i++) {
      if (hi - lo - 1 <= 20 - i) {
        for (int j = lo + 1; j < hi; j++) {
          query(j);
        }
        return;
      }
      int mid = lo + (hi - lo) / 2;
      int cur = query(mid);
      if (cur == 0) return;
      int expect = base * ((mid - lo) % 2 == 0 ? 1 : -1);
      if (cur == expect) {
        lo = mid;
      } else {
        hi = mid;
      }
      base = cur;
    }
  }

  static int query(int pos) {
    System.out.println(pos);
    String s = sc.next();
    if (s.equals("Male")) {
      return 1;
    } else if (s.equals("Female")) {
      return -1;
    } else {
      return 0;
    }
  }

}
