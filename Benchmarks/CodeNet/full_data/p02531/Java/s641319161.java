import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Stack stack = new Stack();
        String command = scanner.next();
        while (!command.equals("quit")) {
            if (command.equals("push")) {
                String block = scanner.next();
                stack.push(block);
            } else if (command.equals("pop")) {
                System.out.println(stack.pop());
                
            }
            command = scanner.next();
        }
        

    }
  
}