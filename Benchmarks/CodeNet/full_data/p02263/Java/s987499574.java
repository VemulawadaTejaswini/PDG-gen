import java.util.Scanner;

class Stack{
    int top,max;
    int[] arr;
    
    Stack(int num) {
        top = 0;
        max = num - 1;
        arr = new int[num]; 
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public boolean isFull() {
        return top >= max;
    }
    public void push(int x) {
        if(isFull()) {
            System.out.println("This stack is ovew flow");
        } else {
            arr[++top] = x;
        }
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("This stack is empty");
        } else {
            top--;
        }
        return arr[top+1];
    }    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(101); 
        
        int a,b;
        
        while(sc.hasNext()) {
            if(sc.next().equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a+b);
            } else if(sc.next().equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a-b);
            } else if(sc.next().equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a*b);
            } else {
                stack.push(sc.nextInt());
            }
        }
        
        System.out.println(stack.pop());
        
    }
    
}