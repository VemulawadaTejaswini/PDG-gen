import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int lr = 0;
    int rl = 0;
    for (int i = 0; i < N - 1; i++) {
      if (s[i] == 'L' && s[i + 1] == 'R') lr++;
      if (s[i] == 'R' && s[i + 1] == 'L') rl++;
    }
    int pairs = Math.min(lr, rl);
    int score = 0;
    for (int i = 0; i < N - 1; i++) if (s[i] == 'R' && s[i + 1] == 'R') score++;
    for (int i = 1; i < N; i++) if (s[i] == 'L' && s[i - 1] == 'L') score++;
    score += 2 * Math.min(pairs, K);
    lr -= pairs;
    rl -= pairs;
    K -= Math.min(pairs, K);
    if (K > 0 && (lr > 0 || rl > 0)) score++;
    System.out.println(score);
  }
}
