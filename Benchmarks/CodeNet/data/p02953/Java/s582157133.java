import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] h = new int[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    
    String s = "Yes";
    if (n > 1 && h[0] - h[1] == 1) h[0]--;
    for (int i = 1; i < n - 1; i++) {
      boolean ok = false;
      if (h[i] >= h[i-1] && h[i] <= h[i+1]) {
        ok = true;
      } else if (h[i]-1 >= h[i-1] && h[i]-1 <= h[i+1]) {
        h[i]--;
        ok = true;
      }
      if (!ok) {
        s = "No";
        break;
      }
    }

    System.out.println(s);
  }
}
