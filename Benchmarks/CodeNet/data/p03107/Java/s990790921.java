import java.io.*;
import java.util.*;

public class Main {

    static PrintStream out = System.out;

    static void solve(Scanner in) {
        char[] chs = in.next().toCharArray();
        int n = chs.length;
        Stack<Character>stack = new Stack<>();
        boolean ok = false;
        for(int i = 0; i < chs.length; i++){
            if(!stack.isEmpty() && (stack.peek() == '0' && chs[i] == '1' || (stack.peek() == '1' && chs[i] == '0')))
                    stack.pop();
            else
                    stack.push(chs[i]);
        }
        System.out.println(n - stack.size());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        solve(in);
    }
}