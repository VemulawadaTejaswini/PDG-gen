package A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());

    int a[] = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    int ans = 0;
    for (int i = 0; i < N; i++) {
      x -= a[i];
      if (x >= 0) {
        ans++;
      }
    }
    if (x > 0) {
      ans--;
    }
    System.out.println(ans);
  }
}