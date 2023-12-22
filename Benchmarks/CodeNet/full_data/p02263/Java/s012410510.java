import java.util.*;

public class Main {

    static int top;
    static int[] s;

    static void push(int x) {
        s[++top] = x;
    }

    static int pop() {
        top--;
        return s[top + 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = new int[1000];
        while (sc.hasNext()) {
            String s = sc.next();
            char c = s.charAt(0);
            if (c == '+') {
                int k = pop();
                int k2 = pop();
                push(k2 + k);
            } else if (c == '-') {
                int k = pop();
                int k2 = pop();
                push(k2 - k);
            } else if (c == '*') {
                int k = pop();
                int k2 = pop();
                push(k2 * k);
            } else {
                push(Integer.parseInt(s));
            }

        }
        System.out.println(pop());
        sc.close();
    }
}
