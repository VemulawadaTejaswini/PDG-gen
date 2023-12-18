import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();

    int[] data = new int[n];
    // String[] data = new String[n];

    for (int i = 0; i < n; i++) {
      data[i] = Integer.valueOf(s.substring(i,i+1));
      // data[i] = s.substring(i,i+1);
    }

    long ans = 0;

    for (int i = 0; i < Math.pow(2,n-1); i++) {
      // String k = "";
      long sum = 0;
      long k = 0;
      for (int j= 0; j < n; j++) {
        k += data[j];
        if ((1&i >> j) == 0) {
          // k += "+";
          sum += k;
          k = 0;
        } else {
          k *= 10;
        }
      }
      ans += sum;
      // System.out.println(k);
    }

    System.out.println(ans);

  }

}
