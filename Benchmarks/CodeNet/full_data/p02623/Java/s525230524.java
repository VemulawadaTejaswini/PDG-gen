import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();

    Queue<Long> a = new ArrayDeque<>();
    Queue<Long> b = new ArrayDeque<>();

    long sum = 0;
    long ans = 0;
    int count = 0;

    for (int i = 0; i < n; i++) {
      a.add(sc.nextLong());
    }

    for (int i = 0; i < m; i++) {
      b.add(sc.nextLong());
    }

    while (true) {
      if (count == n+m) {
        break;
      }
      long x,y;
      if (a.size() == 0) {
        x = b.peek();
        y = b.peek();
      } else if (b.size() == 0) {
        x = a.peek();
        y = b.peek();
      } else {
        x = a.peek();
        y = b.peek();
      }

      // System.out.println(x);
      // System.out.println(y);

      ans = sum;

      if (x > y) {
        try {
          sum += b.poll();
          count++;
        } catch (Exception e) {
          sum += a.poll();
          count++;
        }
      } else {
        try {
          sum += a.poll();
          count++;
        } catch (Exception e) {
          sum += b.poll();
          count++;
        }
      }

      if (sum > k) {
        count--;
        break;
      }

    }

    System.out.println(count);

  }

}
