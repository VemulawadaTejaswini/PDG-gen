import java.util.Scanner;

public class Main {

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

        String[] strings = str.split(" ");
        for (int i=0; i<strings.length; i++){
            if (strings[i].equals("+")){
                int a = pop();
                int b = pop();
                push(a+b);
            }
            else if (strings[i].equals("-")){
                int a = pop();
                int b = pop();
                push(b-a);
            }
            else if (strings[i].equals("*")){
                int a = pop();
                int b = pop();
                push(a*b);
            }
            else {
                push(Integer.parseInt(strings[i]));
            }
        }

        System.out.println(pop());
    }
}