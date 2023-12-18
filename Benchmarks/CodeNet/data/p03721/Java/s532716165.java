import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    long[] a = new long[100010];

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      a[x] += (long)y;
    }

    long sum = 0;
    for (int i = 1; i < a.length; i++) {
      if (sum < k && sum + (long)a[i] >= k) {
        System.out.println(i);
        break;
      }
      sum += (long)a[i];
    }

    sc.close();
  }
}