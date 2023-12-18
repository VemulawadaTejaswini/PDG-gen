    import java.util.*;
    public class Main {
        static boolean find(String s) {
            Stack<Character> ch = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch1 = s.charAt(i);
                if (ch1 == '(') ch.push(ch1);
                else if (ch1 == ')') {
                    if (ch.isEmpty() || ch.peek() != '(') return false;
                    ch.pop();
                }
            }
            return ch.isEmpty();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x=0;
           x+=(n/500)*1000;
           n=n%500;
           x+=(n/5)*5;
            System.out.println(x);
        }
    }
