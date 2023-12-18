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
    for (int i = 0; i < n - 1; i++) {
      boolean ok = false;
      if (i == 0 && h[i] <= h[i+1]) {
        ok = true;
      } else if (i == 0 && h[i]-1 <= h[i+1]) {
        h[i]--;
        ok = true;
      } else if (i != 0 && h[i] >= h[i-1] && h[i] <= h[i+1]) {
        ok = true;
      } else if (i != 0 && h[i]-1 >= h[i-1] && h[i]-1 <= h[i+1]) {
        h[i]--;
        ok = true;
      }
      if (!ok) {
        s = "No";
        break;
      }
      // System.out.println(i + " " + h[i]);
    }

    System.out.println(s);
  }
}
