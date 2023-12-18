import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final String DELIMITER = " ";

  /**
   * Ai1B1 + Ai2B2 + ... + C > 0
   *
   * 2 3 -10
   * 1 2 3
   * 3 2 1
   * 1 2 2
   *
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String firstLine = scanner.nextLine();
    String[] firstArray = firstLine.split(DELIMITER);
    int n = Integer.valueOf(firstArray[0]);
    int m = Integer.valueOf(firstArray[1]);
    int c = Integer.valueOf(firstArray[2]);

    String secondLine = scanner.nextLine();
    String[] secondArray = secondLine.split(DELIMITER);

    List<Integer> ok = new ArrayList<>();

    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      int sum = 0;
      String[] lineArray = line.split(DELIMITER);
      for (int i = 0; i < m; i ++) {
        sum += Integer.valueOf(lineArray[i]) *  Integer.valueOf(secondArray[i]);
      }
      if (sum + c > 0) ok.add(0);
    }

    System.out.println(ok.size());
  }
}
