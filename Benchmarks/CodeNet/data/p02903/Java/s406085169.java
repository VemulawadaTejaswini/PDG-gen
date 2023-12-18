import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String ones = IntStream.range(0, w - a).mapToObj(i -> "1").collect(Collectors.joining());
    String zeros = IntStream.range(0, a).mapToObj(i -> "0").collect(Collectors.joining());
    if (b == 0) {
      for (int i = 0; i < h; i++) {
        System.out.println(ones + zeros);
      }
    }
    if (a == 0) {
      for (int i = 0; i < h; i++) {
        if (i < b) {
          System.out.println(ones);
        } else {
          System.out.println(ones.replaceAll("1", "0"));
        }
      }
    }

    if (h * a == w * b) {
      for (int i = 0; i < h; i++) {
        System.out.println(ones.substring(0, (i * a) % w) + zeros + ones.substring((i * a) % w));
      }
    }
  }
}
