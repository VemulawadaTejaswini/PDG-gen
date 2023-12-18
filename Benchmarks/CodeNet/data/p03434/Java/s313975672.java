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
    int sum = 0;
    int x = (n-1)%2;

    for (int i = n-1; i >= 0; i--) {
      if (i % 2 == x) {
        sum += a[i];
      } else {
        sum -= a[i];
      }
    }

    System.out.println(sum);
    
  }

}
