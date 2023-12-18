import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int k = 1;
    int count = 0;

    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 1; i <= n; i++) {
      k = a[k];
      count++;
      if (k == 2) {
        System.out.println(count);
        return;
      }
    }
    System.out.println("-1");
  }

}
