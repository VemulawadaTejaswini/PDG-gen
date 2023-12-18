import java.util.*;

class V {
  long x, y, z;
  V() {
    x = y = z = 0;
  }
  V(long ax, long ay, long az) {
    x = ax;
    y = ay;
    z = az;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    ArrayList<V> xyz = new ArrayList<V>();
    for (int i = 0; i < N; i++) {
      long x = in.nextLong();
      long y = in.nextLong();
      long z = in.nextLong();
      xyz.add(new V(x, y, z));
    }
    in.close();

    int[][] sgn = {
      {-1, -1, -1},
      {-1, -1,  1},
      {-1,  1, -1},
      {-1,  1,  1},
      { 1, -1, -1},
      { 1, -1,  1},
      { 1,  1, -1},
      { 1,  1,  1}
    };
    long ans = 0;
    for (int[] s: sgn) {
      long[] t = new long[N];
      for (int i = 0; i < N; i++) {
        V v = xyz.get(i);
        t[i] = s[0] * v.x + s[1] * v.y + s[2] * v.z;
      }
      Arrays.sort(t);
      long sum = 0;
      for (int i = 0; i < M; i++) {
        sum += t[N - i - 1];
      }
      ans = Math.max(ans, sum);
    }

    System.out.println(ans);
  }
}
