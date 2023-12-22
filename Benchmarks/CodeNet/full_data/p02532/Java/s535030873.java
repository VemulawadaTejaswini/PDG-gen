import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[][] stacks = new String[n+1][];
        int[] top = new int[n+1];
        
        for (int i = 0; i < n+1; i++) {
            stacks[i] = new String[1000];
            top[i] = 0;
        }
        
        while (true) {
            String command = scanner.next();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("push")) {
                int deck = scanner.nextInt();
                String block = scanner.next();
                stacks[deck][top[deck]++] = block;
            } else if (command.equals("pop")) {
                int deck = scanner.nextInt();
                System.out.println(stacks[deck][top[deck]-1]);
                top[deck]--;
            } else if (command.equals("move")) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                stacks[to][top[to]++] = stacks[from][top[from]--];
            }
        }
    }
}