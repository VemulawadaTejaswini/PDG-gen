import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.nextLine();
        
        Deque<String> deque = new ArrayDeque<String>();
        while (scanner.hasNext()) {
            deque.push(scanner.next());
        }
        int ac = 0;
        int wa = 0;
        String qnum = "";
        String  result = "";
        Map<String,String> submitted = new HashMap<String,String>();
        
        
        while (deque.poll() != null) {
            qnum = deque.pop();
            result = deque.pop();
            if (!submitted.containsKey(qnum)) {
                submitted.put(qnum, result);
                if (result.equals("AC")) {
                    ac++;
                } else if (result.equals("WA")) {
                    wa++;
                }
                continue;
            } else if (submitted.get(qnum) == "AC") {
                submitted.put(qnum, result);
                continue;
            } else if (submitted.get(qnum) == "WA" &&  result =="AC") {
                ac++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ac).append(" ").append(wa);
        System.out.println(sb.toString());
    }
}