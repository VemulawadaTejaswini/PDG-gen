import java.util.Scanner;
import java.util.Stack;

class Main {

  public static int popAsInt(Stack<String> stack) {
    return Integer.parseInt(stack.pop());
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String opsStr = s.nextLine();
    String[] ops = opsStr.split(" ");
    Stack<String> stack = new Stack<String>();
    for (String op : ops) {
      switch(op) {
        case "+":
          stack.push(Integer.toString(popAsInt(stack) + popAsInt(stack)));
          break;
        case "-":
          int second = popAsInt(stack);
          int first = popAsInt(stack);
          stack.push(Integer.toString(first - second));
          break;
        case "*":
          stack.push(Integer.toString(popAsInt(stack) * popAsInt(stack)));
          break;
        default:
          stack.push(op);
          break;
      }
    }
    System.out.println(stack.pop());
  }

}

