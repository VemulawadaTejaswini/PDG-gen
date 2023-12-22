import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st;
        char a,b='a';
        Stack<Character> sta = new Stack<Character>();
        int i,j;
        boolean ch =true;
        while(true){
            st = s.nextLine();
            if(st.equals("."))break;
            for(i=0;i<st.length();i++){
                if(ch==false)break;
                a = st.charAt(i);
                if(a=='(')sta.push(a);
                if(a=='[')sta.push(a);
                if((a==')'||a==']')&&sta.empty())ch=false;
                if((a==')'||a==']')&&sta.size()>0)b = sta.pop();
                if(a==')'&&b!='(')ch=false;
                if(a==']'&&b!='[')ch=false;
            }
            if(sta.size()>0)ch = false;
            if(ch==true)System.out.println("yes");
            else System.out.println("no");
            ch=true;
            while(sta.size()>0)sta.pop();
        }
    }
}
