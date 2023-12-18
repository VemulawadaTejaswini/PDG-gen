import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0') {
                st.push(0);
                count++;
            }
            else if(s.charAt(i) == '1') {
                st.push(1);
                count++;
            }
            else if(s.charAt(i) == 'B') {
                if(count == 0){
                    // do nothing
                } else {
                    st.pop();
                    count--;
                }
            }
        }
        for(int i=0; i<count; i++){
            System.out.print(st.get(i));
        }
    }
}