import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Stack<Double>stack = new Stack<Double>();
    static String[] input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }

    static boolean read(){
        if(!sc.hasNext())return false;
        input = sc.nextLine().split(" ");
        return true;
    }

    static void solve(){
        for(int i = 0; i < input.length; i++){
            String item = input[i];
            double a = 0, b = 0;
            if(item.equals("+")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a+b);
            }else if(item.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a-b);
            }else if(item.equals("*")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a*b);
            }else if(item.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Double.parseDouble(item));
            }
        }
        System.out.printf("%.6f\n", stack.pop());
    }

}