import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int l = s.length();
    String[] x = new String[l];
    for (int i = 0; i < l; i++)
      x[i] = s.substring(i, i + 1);
    
    int r = (int)Math.pow(2, l - 1);
    long sum = 0;
    for (int i = 0; i < r; i++) {
      String a = "";
      for (int j = 0; j < l - 1; j++) {
        a += x[j];
        if ((1 & i >> j) == 1) {
          sum += Long.parseLong(a);
          a = "";
        }
      }
      a += x[l-1];
      sum += Long.parseLong(a);
    }
    
    System.out.println(sum);
  }
}