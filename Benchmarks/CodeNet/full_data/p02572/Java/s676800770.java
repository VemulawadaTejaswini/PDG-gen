import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // 準備するよ！
      long mod = 1_000_000_000 + 7;

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      for(int i=0; i<n; ++i) a[i] = sc.nextLong();

      // 解くよ！
      long ruiseki = 0;
      long ans = 0;
      for(int i=1; i<n; ++i) {
          ruiseki += a[i-1];
          ans     += a[i] * ruiseki;
      }

      System.out.println(ans % mod);

    }
}