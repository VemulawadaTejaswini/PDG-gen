import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char[] words = line.toCharArray();
    for (int i = 0; i < line.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(words[i]);
      }
    }

  }
}