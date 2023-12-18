import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      ArrayDeque<Character> stack = new ArrayDeque<Character>();

      for (int i = 0; i < S.length(); ++i) {
        char cube = S.charAt(i);
        if (stack.isEmpty()) {
          stack.push(cube);
        } else if (cube == '1' && stack.peek() == '0') {
          stack.pop();
        } else if (cube == '0' && stack.peek() == '1') {
          stack.pop();
        } else {
          stack.push(cube);
        }
      }

      System.out.println(S.length() - stack.size());
    }
  }
}