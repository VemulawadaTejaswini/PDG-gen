import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int sum = 0;
    int[] a = new int[n];
    int p = 0;
    String ans = "No";
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }
    for(int i = 0; i < n; i++) {
      if((a[i] * 4 * m) >= sum) p++;
    }
    if(p >= m) ans = "Yes";
    System.out.println(ans);
  }
}