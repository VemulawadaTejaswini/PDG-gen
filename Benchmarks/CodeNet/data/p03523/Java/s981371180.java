import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = s.length();
    String[] data = new String[n];

    for (int i = 0; i < n; i++) {
      data[i] = s.substring(i,i+1);
    }

    for (int i = 0; i < Math.pow(2,n); i++) {
      String k = "";
      for (int j = 0; j < n; j++) {
        if ((1&i >> j) == 0) {
          k += "A";
        }
        k += data[j];
      }
      if (k.equals("AKIHABARA")) {
        System.out.println("YES");
        return;
      } else {
        k += "A";
        if (k.equals("AKIHABARA")) {
          System.out.println("YES");
          return;
        }
      }
    }

    System.out.println("NO");

  }

}
