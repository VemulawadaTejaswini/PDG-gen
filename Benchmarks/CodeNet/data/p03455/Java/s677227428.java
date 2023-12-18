import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String result = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt)
      .reduce((a, b) -> a * b)
      .getAsInt() % 2 == 0 ? "Even" : "Odd";
    System.out.println(result);
  }
}
