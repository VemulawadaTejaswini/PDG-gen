import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = Integer.parseInt(sc.next());
      String result = N < 1000 ? "ABC" : "ABD";

      System.out.println(result);
    }
  }
}
