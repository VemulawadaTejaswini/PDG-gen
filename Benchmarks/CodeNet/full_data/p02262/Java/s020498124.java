import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      int c = sc.nextInt();
      b[i] = c;
    }
    List<Integer> g = new ArrayList<>();
    int m = 10;
    int count = 0;
    do {
      int x = 1;
      m--;
      count = 0;
      for(int i = 0; i < n; i++) {
        int c = b[i];
        a[i] = c;
      }
      do {
        g.add(0, x);
        x = 3 * x + 1;
      } while(m > 0 && x < n / m);
      for(int i = 0; i < g.size(); i++) {
        for(int j = g.get(i); j < n; j++) {
          int v = a[j];
          int k = j - g.get(i);
          while(k >= 0 && v < a[k]) {
            a[k + g.get(i)] = a[k];
            k -= g.get(i);
            count++;
          }
          a[k + g.get(i)] = v;
        }
      }
    } while(count < Math.pow(n, 1.5));
    System.out.println(g.size());
    for(int i = 0; i < g.size(); i++) {
      if(i == g.size() - 1) {
        System.out.println(g.get(i));
      } else {
        System.out.print(g.get(i) + " ");
      }
    }
    System.out.println(count);
    for(int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}

