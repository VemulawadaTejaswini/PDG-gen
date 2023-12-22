import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] stack = new String[1000];
        String command = scanner.next();
        
        int top = 0;

        while (!command.equals("quit")) {
            if (command.equals("push")) {
                    String block = scanner.next();
                    stack[top++] = block;
            } else if (command.equals("pop")) {
                    System.out.println(stack[top-1]);
                    top--;
            }
            command = scanner.next();
        }
    }
}