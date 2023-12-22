import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        String s;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        Scanner scn = new Scanner(s);

        Stack<Integer> stack = new Stack<Integer>();

        while (scn.hasNext()) {
            String op = scn.next();
            if (op.equals("+")) {
                int n = stack.pop() + stack.pop();
                stack.push(n);
            } else if (op.equals("-")) {
                int n = -1 * stack.pop() + stack.pop();
                stack.push(n);
            } else if (op.equals("*")) {
                int n = stack.pop() * stack.pop();
                stack.push(n);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        System.out.println(stack.pop());
    }
}