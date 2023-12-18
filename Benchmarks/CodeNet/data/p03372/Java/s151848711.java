import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long C = sc.nextLong();
    long x[] = new long[N+1];
    long v[] = new long[N+1];
    for (int i=1; i<=N; i++) {
      x[i] = sc.nextLong();
      v[i] = sc.nextLong();
    }
    long vsum[] = new long[N+1];
    long revVsum[] = new long[N+1];
    vsum[0] = 0;
    revVsum[0] = 0;
    for (int i=0; i<N; i++) {
      vsum[i+1] = vsum[i] + v[i+1];
      revVsum[i+1] = revVsum[i] + v[N-i];
    }

    long cal[] = new long[N+1];
    cal[0] = 0;
    long cal2[] = new long[N+1];
    cal2[0] = 0;
    long revcal[] = new long[N+1];
    revcal[0] = 0;
    long revcal2[] = new long[N+1];
    revcal2[0] = 0;
    for (int i=1; i<=N; i++) {
      cal[i] = Math.max(cal[i-1], vsum[i] - x[i]);
      cal2[i] = Math.max(cal2[i-1], vsum[i] - 2*x[i]);
      revcal[i] = Math.max(revcal[i-1], revVsum[i] - (C - x[N-i+1]));
      revcal2[i] = Math.max(cal2[i-1], revVsum[i] - 2*(C - x[N-i+1]));
    }
    long ans = 0;
    for (int i=1; i<=N; i++) {
      ans = Math.max(ans, cal2[i] + revcal[N-i]);
      ans = Math.max(ans, cal[i] + revcal2[N-i]);
    }
    System.out.println(ans);
  }
}
