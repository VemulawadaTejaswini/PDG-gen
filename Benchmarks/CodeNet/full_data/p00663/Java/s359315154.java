import java.util.Scanner;

class Main {
    private static char[] expr;
    private static int ptr;

    private static void consume(char c) {
        assert expr[ptr] == c : "expected " + c + ", but got " + expr[ptr];
        ptr++;
    }

    private static boolean expression() {
        do {
            consume('(');
            if (clause()) {
                consume(')');
                return true;
            } else {
                consume(')');
            }
        } while (ptr < expr.length && expr[ptr++] == '|');
        assert ptr == expr.length;
        return false;
    }

    private static boolean clause() {
        int[] assigments = new int['z' + 1];
        boolean result = true;
        do {
            if (!literal(assigments)) {
                result = false;
            }
        } while (expr[ptr++] == '&');
        ptr--;
        return result;
    }

    private static boolean literal(int[] assigments) {
        int x;
        if (expr[ptr] == '~') {
            ptr++;
            x = 1;
        } else {
            x = -1;
        }
        if (assigments[expr[ptr]] == x) {
            ptr++;
            return false;
        } else {
            assigments[expr[ptr]] = -1 * x;
            ptr++;
            return true;
        }
    }

    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if (input.equals("#")) {
                break;
            }
            Main.ptr = 0;
            Main.expr = input.toCharArray();
            System.out.println(expression() ? "yes" : "no");
        }
    }

    public static void main(String... args) {
        solve();
    }
}