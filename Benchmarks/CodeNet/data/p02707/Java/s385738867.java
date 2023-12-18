import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] cnt = new int[N];
    for (int i = 1; i < N; i++) {
      int A = scanner.nextInt();
      cnt[A - 1]++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(cnt[i]).append('\n');
    }
    System.out.println(sb.toString());
  }
}
