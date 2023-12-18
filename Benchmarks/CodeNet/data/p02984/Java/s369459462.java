import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int mountain = Integer.parseInt(sc.next());
    int[] damRain2Multi = IntStream.range(0, mountain)
      .map(i -> Integer.parseInt(sc.next()) * 2).toArray();
    long matrix[][] = new long[mountain][mountain];
    for (int i = 0; i < mountain; i++) {
      matrix[i][i] = 1;
      matrix[i][(i + 1) % mountain] = 1;
    }
    pw.println(Arrays.stream(gauss(matrix, damRain2Multi)).mapToObj(String::valueOf)
      .collect(Collectors.joining(" ")));
  }

  static int[] gauss(long matrix[][], int[] damRain) {
    int n = damRain.length - 1;
    for (int k = 0; k < n; k++) {
      for (int i = k + 1; i <= n; i++) {
        int q = (int) (matrix[i][k] / matrix[k][k]);
        for (int j = k + 1; j <= n; j++) {
          matrix[i][j] -= q * matrix[k][j];
        }
        damRain[i] -= q * damRain[k];
      }
    }
    damRain[n] /= matrix[n][n];
    for (int k = n - 1; k >= 0; k--) {
      int s = damRain[k];
      for (int j = k + 1; j <= n; j++) {
        s -= matrix[k][j] * damRain[j];
      }
      damRain[k] = (int) (s / matrix[k][k]);
    }
    return damRain;
  }
}
