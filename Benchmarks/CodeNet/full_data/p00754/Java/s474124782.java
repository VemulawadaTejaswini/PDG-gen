import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String line = sc.nextLine();
            if (line.equals(".")) break;
            System.out.println(isBalanced(line));
        }
    }
    
    public static String isBalanced(String line) {
        Stack<Character> st = new Stack<Character>();
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(' || c == '[') {
                st.push(c);
            }
            else if ((c == ')' || c == ']') && st.empty()) {
                return "no";
            }
            else if (c == ')') {
                char t = st.pop();
                if (t != '(') {
                    return "no";
                }
            }
            else if (c == ']') {
                char t = st.pop();
                if (t != '[') {
                    return "no";
                }
            }
        }
        
        if (!st.empty()) return "no";
        
        return "yes";
    }
    
}


