import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int max = 0;
    for (int i = 0; i < N; i++) {
      int[] a = zalgorithm(s, i, N);
      for (int j = 0; j < a.length; j++) max = Math.max(max, Math.min(a[j], j));
    }
    System.out.println(max);
  }

  public static int[] zalgorithm(char[] s, int offset, int N) {
    int[] a = new int[N - offset];
    a[0] = N;
    int i = 1;
    int j = 0;
    while (i < N - offset) {
      while (i + j + offset < N && s[i + j + offset] == s[j + offset]) j++;
      a[i] = j;
      if (j == 0) {
        i++;
        continue;
      }
      int k = 1;
      for (; i + k < N && k + a[k] < j; k++) a[i + k] = a[k];
      i += k;
      j -= k;
    }
    return a;
  }
}
