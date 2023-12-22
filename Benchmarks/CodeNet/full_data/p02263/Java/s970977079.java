import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (isOperand(s)) {
                int a = stack.pop();
                int b = stack.pop();
                switch(s) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        System.out.println(stack.pop());
    }
    
    static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    static boolean isOperand(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }
}

class Stack<T> {
    private List<T> list;
    
    public Stack() {
        list = new ArrayList<>();
    }
    
    public void push(T t) {
        list.add(t);
    }
    
    public T pop() {
        T t = list.get(list.size()-1);
        list.remove(list.size()-1);
        return t;
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}