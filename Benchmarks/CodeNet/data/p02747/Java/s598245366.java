import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        Stack<Integer> stack = null;
        int index = 0;
        if (s.length()==1){
            System.out.println("No");
        }else if (s.length()==2){
            if (s.charAt(0)=='h' && s.charAt(1) == 'i'){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else {
            while ((index = s.indexOf("hi", index)) != -1
                && index<(s.length()-3)    
            ) {

                stack.push(index);
                if(s.charAt(index+2)=='i'){
                    stack.pop();
                }
                index = index + 2;
            }
            if(!stack.isEmpty()){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}