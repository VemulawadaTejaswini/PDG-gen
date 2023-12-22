import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int stack[], sp = 0;
    public static void push(int x){stack[sp++] = x;}
    public static int pop(){return stack[--sp];}

    public static void main(String args[] ) throws Exception {
        stack = new int[100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        String[] arr = line.split(" ");
        for(String str : arr){
            switch(str){
            case "+":
            	push(pop() + pop());
                break;
            case "-":
                push(-1 * pop() + pop());
                break;
            case "*":
                push(pop() * pop());
                break;
            default:
                push(Integer.parseInt(str));
            }
        }
        System.out.println(pop());
    }
}

