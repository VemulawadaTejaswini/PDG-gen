
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yoshizaki
 *151
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();
        int qcount = scanner.nextInt();
        int submitCount = scanner.nextInt();
        for (int i = 1 ; i <= submitCount ; i++) {
            scanner.nextLine();
            deque.push(scanner.next());
            deque.push(scanner.next());
        }
        
        long ac = 0;
        long wa = 0;
        String qnum = "";
        String  result = "";
        Map<String,String> submitted = new HashMap<String,String>();
        
        while (deque.peek() != null) {
            qnum = deque.pollLast();
            result = deque.pollLast();
            if (submitted.containsKey(qnum)) {
                continue;
            }
            if (result.equals("AC")) {
                ac++;
                submitted.put(qnum, result);
                continue;
            }
            wa++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ac).append(" ").append(wa);
        System.out.println(sb.toString());
    }
}