import java.util.Scanner;

public class Stack {

    static int top = 0;
    static int[] num = new int[1000];

    public static void push(int x){

        num[++top] = x;
    }

    public static int pop(){

        top--;
        return num[top+1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        for (int i=0; i<chars.length; i++){
            if (chars[i] == '+'){
                int a = pop();
                int b = pop();
                push(a+b);
            }
            else if (chars[i] == '-'){
                int a = pop();
                int b = pop();
                push(b-a);
            }
            else if (chars[i] == '*'){
                int a = pop();
                int b = pop();
                push(a*b);
            }
            else if (chars[i] == ' '){
               continue;
            }
            else {
                push(Integer.parseInt(String.valueOf(chars[i])));
            }
        }

        System.out.println(pop());
    }
}