import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<Integer>();

        while(sc.hasNext()) {
            String n = sc.next();
            if (n.equals("+")){
                int a = stack.pop()+stack.pop();
                stack.push(a);
            } else if (n.equals("-")){
                int x = stack.pop();
                int y = stack.pop();
                int a = y-x;
                stack.push(a);
            } else if (n.equals("*")) {
                int a = stack.pop()*stack.pop();
                stack.push(a);
            } else {
                stack.push(Integer.parseInt(n));
            }
            
        }
        System.out.println(stack.pop());
        
    }
}

