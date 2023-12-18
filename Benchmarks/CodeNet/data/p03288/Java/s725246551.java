import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int R = Integer.parseInt(sc.next());
      String result = R < 1200 ? "ABC" : R < 2800 ? "ARC" : "AGC";
      System.out.println(result);
    }
  }
}
