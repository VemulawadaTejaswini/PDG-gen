import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int n = 0;
    char[] row = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      n = Integer.parseInt(br.readLine());
      row = br.readLine().toCharArray();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int[] e = new int[n];
    int[] w = new int[n];
    initCumulativeSum(row, e, w);

    for (int i = 1; i <= row.length - 1; i++) {
      if (row[i] == 'E') {
        e[i] = e[i - 1] + 1;
        w[i] = w[i - 1];
      } else if (row[i] == 'W') {
        w[i] = w[i - 1] + 1;
        e[i] = e[i - 1];
      }
    }

    int min = e[e.length-1];
    for (int i = 1; i < n; i++) {
      int sum = (e[e.length-1] - e[i]) + (w[i - 1]);
      min = Math.min(min, sum);
    }
    System.out.print(min);
  }


  private static void initCumulativeSum(char[] row, int[] e, int[] w) {
    if (row[0] == 'E') {
      e[0] = 1;
      w[0] = 0;
    } else if (row[0] == 'W') {
      e[0] = 0;
      w[0] = 1;
    }
  }
}
