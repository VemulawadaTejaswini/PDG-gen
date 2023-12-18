import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder before = new StringBuilder();
        StringBuilder after = new StringBuilder();
        Deque<String> deq = new ArrayDeque<String>(100100);
        String start = scanner.nextLine();
        int query = scanner.nextInt();
        scanner.nextLine();
        String[] querys = new String[query]; 
        boolean reverse = false;
        for(int i = 0; i < query; i++) {
            deq.add(scanner.nextLine());
        }
        before.reverse();
        before.append(start);
        before.append(after.toString());
        if(reverse) before.reverse();
        System.out.println(before.toString());
    }
}
