import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    sc.close();
    System.out.println(compute(line));
  }

  private static int compute(String line) {
    String[] elements = line.split(" ");
    LinkedList<String> stack = new LinkedList<>();
    for (String element : elements) {
      if (element.matches("[0-9]+")) {
        stack.push(element);
      } else if (element.equals("+")) {
        int a = Integer.valueOf(stack.poll());
        int b = Integer.valueOf(stack.poll());
        stack.push(String.valueOf(b + a));
      } else if (element.equals("-")) {
        int a = Integer.valueOf(stack.poll());
        int b = Integer.valueOf(stack.poll());
        stack.push(String.valueOf(b - a));
      } else if (element.equals("*")) {
        int a = Integer.valueOf(stack.poll());
        int b = Integer.valueOf(stack.poll());
        stack.push(String.valueOf(b * a));
      }
    }
    return Integer.valueOf(stack.poll());
  }
}
