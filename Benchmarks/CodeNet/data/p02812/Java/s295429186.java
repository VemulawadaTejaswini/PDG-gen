
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final String s = scanner.next();
    final String s1 = s.replaceAll("ABC", "a");
    System.out.println(s1);
    List<String> sl = Arrays.asList(s1.split(""));
    System.out.println(sl.stream()
        .filter(e -> e.equals("a"))
        .count());
  }
}
