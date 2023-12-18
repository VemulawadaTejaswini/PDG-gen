import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    sc.close();

    for (int i = 0; i < N; i++) {
      K = K - b[i];
      if (K <= 0) {
        System.out.println(a[i]);
        break;
      }
    }

  }

}