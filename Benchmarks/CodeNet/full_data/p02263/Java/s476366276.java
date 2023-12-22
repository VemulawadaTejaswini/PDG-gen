import java.util.Scanner;
import java.util.Stack;

public class Main {
    private Stack<Character> stack = new Stack<>();
    private Stack<Integer> stackInt = new Stack<>();
    private void solve(String s){
        for (int i = 0; i < s.length(); ){
            int a, b = 0;
            char c = s.charAt(i);
            if (c == '+'){
                a = stackInt.pop();
                b = stackInt.pop();
                stackInt.push(a + b);
            }
            else if (c == '-'){
                b = stackInt.pop();
                a = stackInt.pop();
                stackInt.push(a - b);
            }
            else if (c == '*'){
                a = stackInt.pop();
                b = stackInt.pop();
                stackInt.push(a * b);
            }
            else if (c != ' '){
                int j = 0;
                a = 0;
                for (c = s.charAt(i); c != ' ';){
                    stack.push(c);
                    c = s.charAt(++i);
                }
                while (!stack.isEmpty()){
                    a += (stack.pop() - '0') * Math.pow(10, j);
                    j++;
                }
                stackInt.push(a);
            }
            i++;
        }
        System.out.println(stackInt.pop());
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main stack = new Main();
        String s = scanner.nextLine();
        stack.solve(s);
    }
}

