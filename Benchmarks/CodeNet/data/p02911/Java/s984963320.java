import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    // int[] a = new int[q+1];
    int[] data = new int[n+1];

    // for (int i = 1; i <= q; i++) {
    //   a[i] = sc.nextInt();
    // }

    for (int i = 1; i <= n; i++) {
      data[i] = k;
    }

    for (int i = 1; i <= q; i++) {
      int x = sc.nextInt();
      for (int j = 1; j <= n; j++) {
        if(j != x) data[j]--;
      }
    }

    for (int i = 1; i <= n; i++) {
      if (data[i] <= 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }

  }

}
