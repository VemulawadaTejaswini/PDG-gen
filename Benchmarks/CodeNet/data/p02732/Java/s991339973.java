import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int[] cnt = new int[n];
    for (int m : a) {
      cnt[m - 1]++;
    }

    long sum = 0;
    for (int i = 0; i < n; i++) {
      if (cnt[i] < 2) {
        continue;
      }

      int tmp = cnt[i];
      sum += tmp * (tmp - 1);
      sum /= 2;
    }

    for (int i = 0; i < n; i++) {
      int tmp = a[i] - 1;
      if (cnt[tmp] < 2) {
        System.out.println(sum);
      } else {
        System.out.println(sum - (cnt[tmp] - 1));
      }
    }
  }
}
