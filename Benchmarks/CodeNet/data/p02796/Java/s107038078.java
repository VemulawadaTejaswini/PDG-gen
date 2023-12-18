import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] l = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      l[i] = sc.nextInt();
    }

    int c = 0;

    Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      m.put(x[i], l[i]);
    }

    int[] low = new int[n];
    int[] high = new int[n];
    int LOW = 0;
    int HIGH = 0;

    for (Integer i : m.keySet()) {
      System.out.println(i+" "+m.get(i));
      low[LOW] = i-m.get(i);
      LOW++;
      high[HIGH] = i+m.get(i);
      HIGH++;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(low[i] + "     " + high[i]);
    }

    if (n > 2) {
      if (high[0] > low[1] && high[1] <= low[2]) {
        n--;
      }

      if (high[n-2] > low[n-1] && high[n-3] <= low[n-2]) {
        n--;
      }
    }

    for (int i = 1; i < n; i++) {
      if (high[i-1] > low[i]) {
        c++;
      }
    }


    if (c%2 != 0) {
      System.out.println(n-c);
    } else {
      System.out.println(n-c/2);
    }


  }

}
