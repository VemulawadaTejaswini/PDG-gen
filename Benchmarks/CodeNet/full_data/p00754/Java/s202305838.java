import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);

            CONTINUE: while(true){
                String str = scanner.nextLine();
                
                if(str.equals("."))
                    break;
                
                
                Stack<String> stack = new Stack<>();
                try{
                for(int i = 0; i < str.length(); ++i) {
                    if(str.charAt(i) == '(') {
                        stack.push("(");
                    } else if(str.charAt(i) == ')') {
                        if(!stack.pop().equals("(")) {
                            System.out.println("no");
                            
                            continue CONTINUE;
                        }
                    } else if(str.charAt(i) == '[') {
                        stack.push("[");
                    }else if(str.charAt(i) == ']') {
                        if(!stack.pop().equals("[")) {
                            System.out.println("no");
                            
                            continue CONTINUE;
                        }
                    }
                }
                }catch(Exception e){
                    System.out.println("no");
                    continue CONTINUE;
                }
                
                System.out.println(stack.empty() ? "yes" : "no");
            }
    }
}
