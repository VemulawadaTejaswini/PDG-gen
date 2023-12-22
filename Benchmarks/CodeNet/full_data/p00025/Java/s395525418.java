import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready()) {
      String[] dataA = input.readLine().split(" ");
      String[] dataB = input.readLine().split(" ");
      System.out.println(getHitCount(dataA, dataB) + " " + getBlowCount(dataA, dataB));
    }
  }

  private static int getHitCount(String[] a, String[] b) {
    int ret = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i].equals(b[i])) {
        ret++;
      }
    }
    return ret;
  }

  private static int getBlowCount(String[] a, String[] b) {
    int ret = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (i == j) {
          continue;
        }
        if (a[i].equals(b[j])) {
          ret++;
        }
      }
    }
    return ret;
  }
}