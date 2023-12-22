import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        Stack<String> st = new Stack<>();
        for (String s: ss) {
            int first, second, r;
            switch (s) {
                case "+":
                    first = Integer.parseInt(st.pop());
                    second = Integer.parseInt(st.pop());
                    r = second + first;
                    st.push(Integer.toString(r));
                    break;
                case "-":
                    first = Integer.parseInt(st.pop());
                    second = Integer.parseInt(st.pop());
                    r = second - first;
                    st.push(Integer.toString(r));
                    break;
                case "*":
                    first = Integer.parseInt(st.pop());
                    second = Integer.parseInt(st.pop());
                    r = second * first;
                    st.push(Integer.toString(r));
                    break;
                default:
                    st.push(s);
            }
        }
        assert(st.size() == 1);
        System.out.println(st.pop());
    }
}


