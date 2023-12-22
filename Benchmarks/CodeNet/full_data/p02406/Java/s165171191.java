import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0) {
        pw.print(" " + i);
        continue;
      }
      if (String.valueOf(i).contains("3")) {
        pw.print(" " + i);
        continue;
      }
    }
    pw.println();
    pw.flush();
  }
}
