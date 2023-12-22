import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int[] stack = new int[200];
        int idx = 0;
        while (in.hasNext()) {
            String next = in.next();
            if (next.equals("+")) {
                stack[idx - 2] = stack[idx - 2] + stack[idx - 1];
                idx--;

            } else if (next.equals("-")) {
                stack[idx - 2] = stack[idx - 2] - stack[idx - 1];
                idx--;

            } else if (next.equals("*")) {
                stack[idx - 2] = stack[idx - 2] * stack[idx - 1];
                idx--;

            } else {
                int n = Integer.valueOf(next);
                stack[idx++] = n;
            }
        }
        System.out.println(stack[0]);
    }
}