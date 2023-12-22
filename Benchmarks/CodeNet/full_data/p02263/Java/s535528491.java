import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<String> st=new Stack<String>();
        while(sc.hasNext()){
            
            String input=sc.next();
            //if(input.equals("-1")) break;
            String a,b;
            switch (input) {
                case "+":
                    a=st.pop();
                    b=st.pop();
                    st.push((Integer.parseInt(b)+Integer.parseInt(a))+"");
                    break;
                case "-":
                    a=st.pop();
                    b=st.pop();
                    st.push((Integer.parseInt(b)-Integer.parseInt(a))+"");
                    break;
                case "*":
                    a=st.pop();
                    b=st.pop();
                    st.push((Integer.parseInt(b)*Integer.parseInt(a))+"");
                    break;
                case "/":
                    a=st.pop();
                    b=st.pop();
                    st.push((Integer.parseInt(b)/Integer.parseInt(a))+"");
                    break;
                default:
                    st.push(input);
                    break;
            }
        }
        System.out.println(st.pop());
    }
}
