import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    long K = in.nextLong();

    int d[][] = new int[65][N];
    for (int i = 0; i < N; i++) {
      d[0][i] = in.nextInt() - 1;
    }

    for (int i = 0; i < 64; i++) {
      for (int j = 0; j < N; j++) {
        d[i + 1][j] = d[i][d[i][j]];
      }
    }

    int now = 0;
    for (int i = 63; i >= 0; i--) {
      if (((K >> i) & 1) == 1) {
        now = d[i][now];
      }
    }

    System.out.println(now + 1);
  }
}