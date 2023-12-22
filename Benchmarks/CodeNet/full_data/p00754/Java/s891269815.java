import java.util.Scanner;
import java.util.Stack;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        while (!(s = in.nextLine()).equals(".")) {
            Stack<Character> parens = new Stack<Character>();
            boolean ok = true;
            
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    parens.push(c);
                } else if (c == ')') {
                    if (!parens.empty() && parens.peek() == '(') {
                        parens.pop();
                    } else {
                        ok = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!parens.empty() && parens.peek() == '[') {
                        parens.pop();
                    } else {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok && parens.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}