import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        ArrayList<String>[] stacks = new ArrayList[n+1]; 
        for (int i = 0; i < n+1; i++) {
            stacks[i] = new ArrayList<String>();
        }
        
        while (true) {
            String command = scanner.next();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("push")) {
                int deck = scanner.nextInt();
                String block = scanner.next();
                stacks[deck].add(block);
            }/* else if (command.equals("pop")) {
                int deck = scanner.nextInt();
                int top = stacks[deck].size() - 1;
                System.out.println(stacks[deck].get(top));
                stacks[deck].remove(top);
            } else if (command.equals("move")) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                int top = stacks[from].size() - 1;
                stacks[to].add(stacks[from].get(top));
                stacks[from].remove(top);
            }*/
        }
    }
}