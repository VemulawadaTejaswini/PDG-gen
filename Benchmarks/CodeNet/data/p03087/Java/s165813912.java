import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];

    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    int[] data = new int[q];

    for (int i = 0; i < q; i++) {
      for (int j = l[i]-1; j < r[i]-1; j++) {
        String k = s.substring(j,j+2);
        if (k.equals("AC")) {
          data[i]++;
        }
      }
    }

    for (int i = 0; i < q; i++) {
      System.out.println(data[i]);
    }

  }

}
