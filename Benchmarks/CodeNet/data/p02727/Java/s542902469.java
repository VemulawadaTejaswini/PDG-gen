import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int[] p = new int[A];
    int[] q = new int[B];
    Queue<Integer> r = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < A; i++) {
      p[i] = sc.nextInt();
    }
    for (int i = 0; i < B; i++) {
      q[i] = sc.nextInt();
    }
    for (int i = 0; i < C; i++) {
      r.add(sc.nextInt());
    }
    Arrays.sort(p);
    Queue<Integer> p1 = new PriorityQueue<>();
    Arrays.sort(q);
    Queue<Integer> q1 = new PriorityQueue<>();
    long ans = 0;
    for (int i = A - X; i < A; i++) {
      ans += p[i];
      p1.add(p[i]);
    }
    for (int i = B - Y; i < B; i++) {
      ans += q[i];
      q1.add(q[i]);
    }

    int a = A - X, b = B - Y;
    while (!r.isEmpty()) {
      int r1 = r.poll();
      int a1 = p1.peek();
      int b1 = q1.peek();
      if (a1 < b1) {
        if (r1 > a1) {
          ans -= a1;
          ans += r1;
          p1.poll();
          p1.add(r1);
        }
      } else {
        if (r1 > b1) {
          ans -= b1;
          ans += r1;
          q1.poll();
          q1.add(r1);
        }
      }
    }

    System.out.println(ans);
  }
}
