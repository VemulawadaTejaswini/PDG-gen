import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    System.out.println(calc(input));
  }

  public static boolean inputIsOperand(String input) {
    try {
      Integer.parseInt(input);
      return true;

    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int calc(String input) {
    Deque<Integer> operand = new ArrayDeque<Integer>(100000);
    String[] inputs = input.split(" ");

    int operand1, operand2;
    int result = 0;

    for (String str : inputs) {

      if (str.equals("+")) {
        operand1 = operand.removeFirst();
        operand2 = operand.removeFirst();
        operand.offerFirst(operand2 + operand1);

      } else if (str.equals("-")) {
        operand1 = operand.removeFirst();
        operand2 = operand.removeFirst();
        operand.offerFirst(operand2 - operand1);

      } else if (str.equals("*")) {
        operand1 = operand.removeFirst();
        operand2 = operand.removeFirst();
        operand.offerFirst(operand2 * operand1);

      } else {
        operand.offerFirst(Integer.parseInt(str));
      }
    }

    return operand.removeFirst();
  }
}

