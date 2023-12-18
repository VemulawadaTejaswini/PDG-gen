import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[][] a = new int[N][N];
    int[][] b = new int[N][N];

    for (int i=0; i < N; i++) {
      a[i][0] = sc.nextInt();
      a[i][1] = sc.nextInt();
    }

    for (int i=0; i < N; i++) {
      b[i][0] = sc.nextInt();
      b[i][1] = sc.nextInt();
    }

    int count = 0;

    for (int i=0; i < N; i++) {
      int tmp_min = Integer.MAX_VALUE;
      int tmp_j = N;

      for (int j=0; j < N; j++) {
        if (a[i][0] < b[j][0] && a[i][1] < b[j][1] && b[j][0] + b[j][1] - a[i][0] - a[i][1] < tmp_min) {
          tmp_min = b[j][0] + b[j][1] - a[i][0] - a[i][1];
          tmp_j = j;
          count++;
        }

        if (tmp_j != N) {
          b[tmp_j][0] = 0;
          b[tmp_j][1] = 0;
        }
      }
    }

    System.out.println(count);
  }
}
