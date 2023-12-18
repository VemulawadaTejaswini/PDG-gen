import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];

    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    Arrays.sort(s);

    int[] c = new int[n];
    int max = 0;

    for (int i = 0; i < n-1; i++) {
      if (s[i].equals(s[i+1])) {
        c[i+1] += c[i] + 1;
        max = Math.max(max,c[i+1]);
      }
    }

    for (int i = 0; i < n; i++) {
      if (c[i] == max) {
        System.out.println(s[i]);
      }
    }


  }

}
