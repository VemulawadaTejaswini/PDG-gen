import java.util.Scanner;
import java.util.Stack;

//Switching Railroad Cars
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(x==0){
            	System.out.println(st.pop());
            }else{
            	st.push(x);
            }
        }
    }
}