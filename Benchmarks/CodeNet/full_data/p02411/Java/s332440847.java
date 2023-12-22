import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    while (true) {
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();

        if (m == -1 && f == -1 && r == -1) break;

        if (m == -1 || f == -1) {
            pw.println("F");
        } else if (m + f < 30) {
            pw.println("F");
        } else if (30 <= m + f && m + f < 50 && 50 <= r) {
            pw.println("C");
        } else if (30 <= m + f && m + f < 50) {
            pw.println("D");
        } else if (50 <= m + f && m + f < 65) {
            pw.println("C");
        } else if (65 <= m + f && m + f < 80) {
            pw.println("B");
        } else if (80 <= m + f) {
            pw.println("A");
        } else {
            // do nothing
        }
    }

    pw.flush();
    sc.close();
  }
}
