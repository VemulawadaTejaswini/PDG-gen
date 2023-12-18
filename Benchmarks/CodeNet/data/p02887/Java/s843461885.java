import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String answer = "";
        char now = str.charAt(0);
        answer += String.valueOf(now);
        for (int i = 1; i < n; i++) {
            char next = str.charAt(i);
            
            if (now != next) {
                answer += String.valueOf(next);
                now = next;
            }
            
        }
        System.out.println(answer.length());
    }
}
