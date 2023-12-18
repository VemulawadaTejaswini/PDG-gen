import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int alice = 0;
    int bob = 0;
    boolean alice_turn = true;
    for (int i = a.length - 1; i >= 0; i--) {
      if (alice_turn) {
        alice += a[i];
        alice_turn = false;
      } else {
        bob += a[i];
        alice_turn = true;
      }
    }
    System.out.println(alice - bob);
  }
}