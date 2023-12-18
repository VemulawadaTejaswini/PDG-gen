import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }
    Number[] s = new Number[N * (N + 1) / 2];
    int k = 0;
    for (int i = 0; i < N; i++) {
      long sum = 0;
      for (int j = i; j < N; j++) {
        sum += a[j];
        s[k++] = new Number(sum, bin(sum));
      }
    }
    Arrays.sort(s, Comparator.comparing(number -> number.rep));
    long res = -1;
    for (int i = 0; i < K; i++) {
      res = res & s[s.length - i - 1].value;
    }
    System.out.println(res);
  }

  private static String bin(long a) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 45; i++) {
      if (a % 2 != 0) sb.append('1');
      else sb.append('0');
      a /= 2;
    }
    return sb.reverse().toString();
  }

  private static class Number {
    private final long value;
    private final String rep;

    private Number(long value, String rep) {
      this.value = value;
      this.rep = rep;
    }
  }
}
