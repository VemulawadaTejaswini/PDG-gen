import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        LinkedList<Integer> stack = new LinkedList();
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.charAt(0) == '+') {
                b = stack.pop();
                a = stack.pop();
                stack.push(a + b);
            } else if (input.charAt(0) == '*') {
                b = stack.pop();
                a = stack.pop();
                stack.push(a * b);
            } else if (input.charAt(0) == '-') {
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
            } else {
                stack.push(Integer.parseInt(input));
            }
        }
        System.out.println(stack.pop());
    }
}
