import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    a[0] = sc.nextInt();
    a[1] = sc.nextInt();
    a[2] = sc.nextInt();
    Arrays.sort(a);
    int k = sc.nextInt();
    int ans = a[0] + a[1];
    for(int i = 0; i < k; i++) {
      a[2] *= 2;
    }
    ans += a[2];
    System.out.println(ans);
  }
}