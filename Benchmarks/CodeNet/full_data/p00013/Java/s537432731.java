import java.util.Scanner;
import java.util.Stack;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println(stack.pop());
            } else {
                stack.push(n);
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}