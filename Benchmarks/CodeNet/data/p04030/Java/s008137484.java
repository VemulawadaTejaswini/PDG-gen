import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!='B'){
                st.push(c);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        System.out.println(ans);
    }
}
