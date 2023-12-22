import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int time = sc.nextInt();
    String[] inputs = new String[time * 2];
    for (int i = 0; i < time * 2; i++) {
      inputs[i] = sc.next();
    }

    for (int i = 0; i < time; i++) {
      System.out.println(LCSLength(inputs[i*2].toCharArray(), inputs[i*2+1].toCharArray()));
    }
  }

  public static int LCSLength(char[] x, char[] y) {
    int m = x.length;
    int n = y.length;
    int[][] c = new int[m+1][n+1];

    for (int i = 1; i <= m; i++) {
      c[i][0] = 0;
    }
    for (int j = 0; j <= n; j++) {
      c[0][j] = 0;
    }
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {

        if (x[i-1] == y[j-1]) {
          c[i][j] = c[i-1][j-1] + 1;

        } else if (c[i-1][j] >= c[i][j-1]) {
          c[i][j] = c[i-1][j];

        } else {
          c[i][j] = c[i][j-1];
        }
      }
    }

    return c[m][n];
  }
}

