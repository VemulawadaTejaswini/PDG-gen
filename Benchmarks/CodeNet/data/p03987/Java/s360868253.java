import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    long ans = 0;
    for (int l = 0; l < N; l++) {
      for (int r = l; r < N; r++) {
        long m = Integer.MAX_VALUE;
        for(int i = l; i <= r ; i++) {
          m = Math.min(m, a[i]);
        }
        ans += m;
      }
    }

    System.out.println(ans);
  }
}
