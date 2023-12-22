import java.util.Scanner;
import java.util.Stack;

public class Main{
    //problem from izu
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String next = in.nextLine();
        String[] str = next.split(" ");
        //System.out.println(str[1]);
        Stack<Integer> stack = new Stack<>();
        int length = str.length;
        for(int i = 0; i<length; i++){
            if(str[i].charAt(0)=='+' || str[i].charAt(0)=='-' || str[i].charAt(0)=='*'){
                int a = stack.pop();
                int b = stack.pop();
                if(str[i].charAt(0)=='+'){
                    stack.push(a+b);
                } else if(str[i].charAt(0)=='-'){
                    stack.push(b-a);
                } else if(str[i].charAt(0)=='*'){
                    stack.push(a*b);
                }
            }
            else {
                int temp = 0;
                for(int k = 0; k<str[i].length(); k++){
                    temp*=10;
                    temp+=(str[i].charAt(k) - '0');
                }
                stack.push(temp);
                //System.out.println(temp);
            }
        }
        System.out.println(stack.pop());
        
    }

}

