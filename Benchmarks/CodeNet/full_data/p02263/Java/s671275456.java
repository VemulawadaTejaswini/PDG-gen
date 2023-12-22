import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    private Scanner sc;

    private void solve() {
        sc = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<String>();
        String line = sc.nextLine();
        String[] a = line.split(" ");
        for (String s : a) {
            if ("+".equals(s)) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(n1 + n2));
            } else if ("-".equals(s)) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(n2 - n1));
            } else if ("*".equals(s)) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(n1 * n2));
            } else {
                stack.push(s);
            }
        }
        System.out.println(stack.pop());
    }
}