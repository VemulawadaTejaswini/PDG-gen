import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {

    int top, tmp;
    int[] data;

    public Stack() {
        top = -1;
        data = new int[1000];
        tmp = 0;
    }

    public int pop() {
        tmp = data[top];
        data[top--] = 0;
        return tmp;
    }

    public void push(int a) {
        data[++top] = a;
    }
}

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack s = new Stack();
        int a, b;
        try {
            String[] n;
            n = br.readLine().split(" ");
            for (int i = 0; i < n.length; i++) {
                if (n[i].equals("+")) {
                    a = s.pop();
                    b = s.pop();
                    s.push(a + b);
                } else if (n[i].equals("-")) {
                    a = s.pop();
                    b = s.pop();
                    s.push(b - a);
                } else if (n[i].equals("/")) {
                    a = s.pop();
                    b = s.pop();
                    s.push(b / a);
                } else if (n[i].equals("*")) {
                    a = s.pop();
                    b = s.pop();
                    s.push(a * b);
                } else {
                    s.push(Integer.parseInt(n[i]));
                }
            }
            System.out.println(s.pop());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
