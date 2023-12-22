import java.util.Scanner;

class Main{

    static int top = 0;
    static int[] stack = new int[1000];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] n = (sc.nextLine()).split(" ");

        for(int i = 0; i < n.length; i++){
            if(n[i].equals("+")){
                int b = pop();
                int a = pop();
                push(a + b);
            }else if(n[i].equals("-")){
                int b = pop();
                int a = pop();
                push(a - b);
            }else if(n[i].equals("*")){
                int b = pop();
                int a = pop();
                push(a * b);
            }else
            push(Integer.parseInt(n[i]));
        }
        System.out.println(pop());
    }

    static void push(int x){
        stack[++top] = x;
    }

    static int pop(){
        top--;
        return stack[top + 1];
    }
}

