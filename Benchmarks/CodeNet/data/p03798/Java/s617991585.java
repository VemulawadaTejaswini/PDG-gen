import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int[] si = new int[N];
    for (int i = 0; i < N; i++) {
      si[i] = s[i] == 'o' ? 0 : 1;
    }

    for (int[] t : new int[][] {{0, 0}, {0, 1}, {1, 0}, {1, 1}}) {
      int[] a = test(t, si, N);
      if (a != null) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
          sb.append(a[i] == 0 ? 'S' : 'W');
        }
        System.out.println(sb.toString());
        return;
      }
    }
    System.out.println(-1);
  }

  private static int[] test(int[] t, int[] s, int N) {
    int[] a = new int[N];
    a[0] = t[0];
    a[1] = t[1];
    for (int i = 1; i < N - 1; i++) a[i + 1] = a[i - 1] ^ (a[i] ^ s[i]);
    if ((a[N - 2] ^ (a[N - 1] ^ s[N - 1])) != a[0]
        || (a[N - 1] ^ (a[0] ^ s[0])) != a[1]) return null;
    return a;
  }
}
