import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Stack stack = new Stack();
        String[] stack = new String[1000];
        String command = scanner.next();
        
        int top = 0;

        while (!command.equals("quit")) {
            switch (command) {
                case "push":
                    String block = scanner.next();
                    //stack.push(block);
                    stack[top++] = block;
                    break;
                case "pop":
                    //System.out.println(stack.pop());
                    System.out.println(stack[top-1]);
                    top--;
                    break;
            }
            command = scanner.next();
        }
    }
}