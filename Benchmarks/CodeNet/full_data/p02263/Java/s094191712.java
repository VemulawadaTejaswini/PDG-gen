import java.util.Scanner;
import java.util.Stack;

class Main{
    static Stack<Integer> stack;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        stack = new Stack<>();
        while(sc.hasNext()){
            String str = sc.next();
            switch(str.charAt(0)){
                case '+':
                polandp();
                break;
                case '-':
                polandm();
                break;
                case '*':
                polanda();
                break;
                default:
                stack.push(Integer.parseInt(str));
            }
        }
        System.out.println(stack.pop());
    }
    
    private static void polandp(){
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a+b);
    }
    private static void polandm(){
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a-b);
    }private static void polanda(){
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a*b);
    }
}
