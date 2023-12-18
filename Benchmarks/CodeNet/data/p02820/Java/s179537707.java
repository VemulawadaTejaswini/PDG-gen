import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int R = sc.nextInt();
    int S = sc.nextInt();
    int P = sc.nextInt();
    char[] T = sc.next().toCharArray();
    char[] ans = new char[T.length];
    for (int i = 0; i < T.length; i++) {
      switch (T[i]) {
        case 'r':
          ans[i] = 'P';
          break;
        case 's':
          ans[i] = 'R';
          break;
        case 'p':
          ans[i] = 'S';
          break;
      }
    }
    int score = 0;
    for (int i = 0; i < T.length; i++) {
      if (i - K >=0 && ans[i - K] == ans[i]) {
        ans[i] = 'O';
      } else {
        score += ans[i] == 'P' ? P : (ans[i]=='S' ? S : R);
      }
    }
    System.out.println(score);
  }
}
