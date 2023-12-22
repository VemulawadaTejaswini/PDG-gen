
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int d = Integer.parseInt(scanner.nextLine());
      int x = 600;
      int count = x / d;
      int result = 0;
      for (int i = 0; i < count; i++) {
        result += d * Math.pow(d * i, 2);
      }
      System.out.println(result);
    }
  }

}