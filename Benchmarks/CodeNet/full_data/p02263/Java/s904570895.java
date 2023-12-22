import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        Stack stack = new Stack();

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (s[i].equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (s[i].equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            } else {
                int a = Integer.parseInt(s[i]);
                stack.push(a);
            }
        }

        System.out.println(stack.pop());
    }

    static class Stack {
        int[] S;
        int index;

        Stack() {
            S = new int[1000];
            index = 0;
        }

        void push(int x) {
            S[index++] = x;
        }

        int pop() {
            return S[--index];
        }
    }
}
