import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        Stack<Long> st = new Stack<Long>();
        while (input.hasNext()) {
            String s = input.next();
            if ("+".equals(s)) {
                long y = Long.valueOf(st.pop());
                long x = Long.valueOf(st.pop());
                st.push(x + y);
            } else if ("-".equals(s)) {
                long y = Long.valueOf(st.pop());
                long x = Long.valueOf(st.pop());
                st.push(x - y);
            } else if ("*".equals(s)) {
                long y = Long.valueOf(st.pop());
                long x = Long.valueOf(st.pop());
                st.push(x * y);
            } else {
                st.push(Long.valueOf(s));
            }
        }
        System.out.println(st.pop());
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
}