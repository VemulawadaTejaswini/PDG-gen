
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack();
        while (true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            if (s.equals("0")) {
                System.out.println(stack.pop());
            } else {
                stack.push(s);
            }
        }
    }
}