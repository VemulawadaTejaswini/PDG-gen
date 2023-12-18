import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int Q = sc.nextInt();
    int[][] ab = new int[N][2];
    int[] p = new int[Q];
    int[] x = new int[Q];

    for (int i = 1; i < N; i++) {
      ab[i][0] = sc.nextInt();
      ab[i][1] = sc.nextInt();
    }

    for (int i = 0; i < Q; i++) {
      p[i] = sc.nextInt();
      x[i] = sc.nextInt();
    }

    sc.close();

    int[] v = new int[N+1];

    for (int i = 0; i < Q; i++) {
      v[p[i]] += x[i];
    }

    Arrays.sort(ab, (a,b) -> Integer.compare(a[0],b[0]));
    Arrays.sort(ab, (a,b) -> Integer.compare(a[1],b[1]));

    for (int i = 1; i < N; i++) {
      v[ab[i][1]] += v[ab[i][0]];
    }

    for (int i = 1; i < N+1; i++) {
      System.out.println(v[i]);
    }

  }

}