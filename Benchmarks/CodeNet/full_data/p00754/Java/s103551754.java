import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Deque<Character> deque;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals(".")) break;
            deque = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int size = deque.size();
                if (c=='(' || c=='[') {
                    deque.addLast(c);
                } else if (c==')') {
                    if (size > 0 && deque.getLast()=='(') {
                        deque.pollLast();
                    } else {
                        deque.addLast(c);
                    }
                } else if (c==']') {
                    if (size > 0 && deque.getLast()=='[') {
                        deque.pollLast();
                    } else {
                        deque.addLast(c);
                    }
                }
                if (c=='.') break;
            }
            
            if (deque.size() == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}