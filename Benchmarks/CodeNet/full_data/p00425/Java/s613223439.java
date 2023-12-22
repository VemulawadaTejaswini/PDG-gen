import java.util.Scanner;

public class Main {
  private Scanner s;

  public void run() {
    int n;
    final int U = 0;
    final int B = 1;
    final int N = 2;
    final int S = 3;
    final int E = 4;
    final int W = 5;
    while ((n = s.nextInt()) != 0) {
      int sum = 1;
      int[] dice = { 1, 6, 5, 2, 3, 4 };
      for (int i = 0; i < n; i++) {
        String d = s.next();
        int tmp;
        if (d.equals("North")) {
          tmp = dice[U];
          dice[U] = dice[S];
          dice[S] = dice[B];
          dice[B] = dice[N];
          dice[N] = tmp;
        }
        if (d.equals("South")) {
          tmp = dice[U];
          dice[U] = dice[N];
          dice[N] = dice[B];
          dice[B] = dice[S];
          dice[S] = tmp;
        }
        if (d.equals("West")) {
          tmp = dice[U];
          dice[U] = dice[E];
          dice[E] = dice[B];
          dice[B] = dice[W];
          dice[W] = tmp;
        }
        if (d.equals("East")) {
          tmp = dice[U];
          dice[U] = dice[W];
          dice[W] = dice[B];
          dice[B] = dice[E];
          dice[E] = tmp;
        }
        if (d.equals("Left")) {
          tmp = dice[N];
          dice[N] = dice[E];
          dice[E] = dice[S];
          dice[S] = dice[W];
          dice[W] = tmp;
        }
        if (d.equals("Right")) {
          tmp = dice[N];
          dice[N] = dice[W];
          dice[W] = dice[S];
          dice[S] = dice[E];
          dice[E] = tmp;
        }
        sum += dice[U];
      }
      System.out.printf("%d\n", sum);
    }
  }

  public void init() {
    s = new Scanner(System.in);
  }

  static public void main(String[] args) {
    Main m = new Main();
    m.init();
    m.run();
  }
}