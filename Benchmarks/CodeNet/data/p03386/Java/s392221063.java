import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    if (Math.abs(a - b) < k) {
      for (int i = a; i <= b; i++) {
        System.out.println(i);
      }
      return;
    }

    Set<Integer> s = new HashSet();

    for (int i = 0; i < k; i++) {
      s.add(a + i);
    }
    for (int i = k; i >= 1; i--) {
      s.add(b - i + 1);
    }

    for (Integer i : s) {
      System.out.println(i);
    }
  }
}