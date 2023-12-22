import java.util.*;
import java.math.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Deque<Integer> stack = new ArrayDeque<Integer>();
    String out = "";
    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      if (a == 0) {
        out += stack.pop() + "\n";
        continue;
      }
      stack.push(a);
    }
    System.out.print(out);
  }
}