import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] numbers = sc.nextLine().split(" ", 0);
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i].equals("0")) {
        System.out.println(i + 1);
        break;
      }
    }
  }
}
