import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();

    long[][] matrix = new long[H][W];
    for (int i = 0; i < H; i++) {
      String line = scan.next();
      for (int j = 0; j < W; j++) {
        matrix[i][j] = '#' == line.charAt(j) ? -1 : 0;
      }
    }

    scan.close();

    System.out.println(gridPaths(matrix));
  }

  private static long gridPaths(long[][] matrix) {
    int I = matrix.length;
    if (I == 0) return 0;
    int J = matrix[0].length;

    matrix[0][0] = 1;

    for (int i = 0; i < I; i++) {
      for (int j = 0; j < J; j++) {
        if (i == 0 && j == 0) continue;
        if (matrix[i][j] < 0) {
          matrix[i][j] = 0;
          continue;
        }

        long top  = i > 0 ? matrix[i - 1][j] : 0;
        long left = j > 0 ? matrix[i][j - 1] : 0;

        matrix[i][j] = (top + left) % 1000_000_007;
      }
    }
    return matrix[I - 1][J - 1];
  }
}