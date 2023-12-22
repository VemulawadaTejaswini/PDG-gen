import java.util.*;

class IntStack {
    int[] arr;
    int top;
    int MAX;

    public IntStack(int max) {
        this.MAX = max;
        arr = new int[max];
    }

    void initialize() {
        top = 0;
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top >= MAX - 1;
    }

    void push(int x) {
        if (isFull()) {
            throw new RuntimeException("オーバーフロー");
        }
        top++;
        arr[this.top] = x;
    }

    int pop() {
        if (isEmpty()) {
            throw new RuntimeException("アンダーフロー");
        }
        top--;
        return arr[this.top + 1];
    }
}

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(200);
        stack.initialize();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                stack.push(sc.nextInt());
            } else {
                String s = sc.next();
                int res;
                if (s.equals("+")) {
                    res = stack.pop() + stack.pop();
                } else if (s.equals("-")) {
                    res = - stack.pop() + stack.pop();
                } else if (s.equals("*")) {
                    res = stack.pop() * stack.pop();
                } else {
                    throw new RuntimeException("hoge");
                }
                stack.push(res);
            }
        }

        System.out.println(stack.pop());
    }
}
