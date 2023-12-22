import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		while(stdIn.hasNextInt()){
			int n = stdIn.nextInt();
			if(n==0){
				System.out.println(st.pop());
			}
			else{
				st.push(new Integer(n));
			}
		}
	}
}