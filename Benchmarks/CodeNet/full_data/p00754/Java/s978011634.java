import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Stack<String> st = new Stack<String>();
        while(true){
            String S = sc.nextLine();
            if(S.equals(".")) break;
            for(int i=0; i<S.length(); i++){
                char a = S.charAt(i);
                if(a == '(') st.push("(");
                else if(a == '[') st.push("[");
                else if(a==')' || a==']'){
                   if(st.empty()){
                        System.out.println("no");
                        flag = false;
                        break;
                   }else{
                       if(a==')' && st.peek().equals("(")) st.pop();
                       else if(a==']' && st.peek().equals("[")) st.pop();
                       else{
                           System.out.println("no");
                           flag = false;
                           break;
                       }
                   }
                }
            }
            if(flag) System.out.println(st.empty()?"yes":"no");
            flag = true;
            st.clear();
        }
    }
}
