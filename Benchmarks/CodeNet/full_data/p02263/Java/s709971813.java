import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        compute(expression);
    }

    private static void compute(String expression) {
        Scanner in = new Scanner(expression);
        Stack<Integer> stack = new Stack<>();
        while (in.hasNext()) {
            String next = in.next();
            switch (next) {
                case "+": {
                    int first = stack.pop();
                    int second = stack.pop();
                    int sum = second + first;
                    stack.push(sum);
                    break;
                }
                case "-": {
                    int first = stack.pop();
                    int second = stack.pop();
                    int diff = second - first;
                    stack.push(diff);
                    break;
                }
                case "*": {
                    int first = stack.pop();
                    int second = stack.pop();
                    int product = second * first;
                    stack.push(product);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(next));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}

