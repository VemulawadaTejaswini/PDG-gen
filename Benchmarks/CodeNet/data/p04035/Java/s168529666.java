import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner s = new Scanner(System.in);
    final int N = Integer.parseInt(s.next());
    final int L = Integer.parseInt(s.next());
    int before = Integer.parseInt(s.next());
    int last = 0;

    for (int i = 1; i < N; i++) {
      final int a = Integer.parseInt(s.next());
      if (a + before >= L) {
        last = i;
        break;
      }
      before = a;
    }
    if (last == 0) {
      System.out.println("Impossible");
    } else {
      System.out.println("Possible");
      for (int i = 1; i < last; i++) {
        System.out.println(i);
      }
      for (int i = N - 1; i > last; i--) {
        System.out.println(i);
      }
      System.out.println(last);
    }
  }
}