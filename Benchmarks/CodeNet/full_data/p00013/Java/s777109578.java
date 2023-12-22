import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		
		while(sc.hasNext()){
			int num = sc.nextInt();
			
			if(num == 0){
				int tmp = st.pop();
				System.out.println(tmp);
			}
			else {
				st.push(num);
			}
		}
	}
}