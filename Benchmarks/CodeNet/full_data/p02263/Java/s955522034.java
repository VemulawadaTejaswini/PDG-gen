import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Long> st = new Stack<Long>();

        while (sc.hasNext()){
            String s = sc.next();
            switch (s){
                case "+":
                    st.push(st.pop()+st.pop());
                    break;
                case "-":
                    st.push(-st.pop()+st.pop());
                    break;
                case "*":
                    st.push(st.pop()*st.pop());
                    break;
                default:
                    st.push(new Long(s));
            }
        }
        System.out.println(st.pop());
    }
}