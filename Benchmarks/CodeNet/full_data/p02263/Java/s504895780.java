

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if(size() == capacity)
            expand();

        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0 , newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }

    public int pop() {
        int data = 0;

        if(isEmpty())
        {
            System.out.println("stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    public void shrink() {
        int length = size();
        if(length <= (capacity/2)/2)
        {
            capacity = capacity / 2;
        }
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0 , newStack, 0, length);
        stack = newStack;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        Main stack1 = new Main();
        int a, b;

        for(String s : lines)
        {
            if(s.equals("+"))
            {
                a = stack1.pop();
                b = stack1.pop();
                stack1.push(a+b);
            } else if(s.equals("-"))
            {
                a = stack1.pop();
                b = stack1.pop();
                stack1.push(b-a);
            } else if(s.equals("*"))
            {
                a = stack1.pop();
                b = stack1.pop();
                stack1.push(a*b);
            } else {
                stack1.push(Integer.parseInt(s));
            }
        }
        System.out.println(stack1.pop());
    }
}

