import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int n = sc.nextInt();

    int[] a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();

    for (int i = a.length - 1; i >= 0; i--) {
        pw.print(a[i]);
        pw.print(i == 0 ? "" : " ");
    }
    pw.println();
    pw.flush();

    sc.close();
  }
}
