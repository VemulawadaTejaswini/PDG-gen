import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        Stack<Integer> stack = new Stack<Integer>();
        int a=0,b=0;
        for(int i=0; i<line.length; i++){
            if(line[i].equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b+a);
            } else if (line[i].equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b-a);
            } else if (line[i].equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b*a);
            } else {
                stack.push(Integer.parseInt(line[i]));
            }
        }
        System.out.println(stack.pop());
    }
}

