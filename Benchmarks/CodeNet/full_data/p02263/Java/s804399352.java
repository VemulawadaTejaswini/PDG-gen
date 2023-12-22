import java.util.Scanner;

public class Main {
    private static int[] stack;
    private static int top=0;
    private static void push(int num){
        stack[++top]=num;
    }
    private static int pop(){
        return stack[top--];
    }
    public static void main(String[] args) {
        stack = new int[205];
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        for (String s : ss) {
            switch (s) {
                case "+": {
                    int b = pop();
                    int a = pop();
                    push(a + b);
                    break;
                }
                case "-": {
                    int b = pop();
                    int a = pop();
                    push(a - b);
                    break;
                }
                case "*": {
                    int b = pop();
                    int a = pop();
                    push(a * b);
                    break;
                }
                default:
                    push(Integer.parseInt(s));
                    break;
            }
        }
        System.out.println(pop());
    }
}

