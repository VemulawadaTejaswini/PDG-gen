import java.util.*;

public class Main {
    //Unification
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        System.out.println(helper(A));
        sc.close();
    }

    public static int helper(char[] A) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (char a : A) {
            if (stack.isEmpty()) stack.push(a);
            else {
                if (stack.peek() != a) {
                    stack.pop();
                    res += 2;
                } else stack.push(a);
            }
        }
        return res;
    }
}
