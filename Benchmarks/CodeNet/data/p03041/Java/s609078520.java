import java.util.*;
import java.lang.Character;

class Main {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int target = scanner.nextInt();
    String line = scanner.next();
    for (int i = 0; i < length; i++) {
      if (i == target - 1) {
        System.out.print(Character.toLowerCase(line.charAt(i)));
      }
      else {
        System.out.print(line.charAt(i));
      }
    }
  }
}