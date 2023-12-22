import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Stack<Integer> stk=new Stack<>();
		
		while(in.hasNext()) {
			int t=in.nextInt();
			if(t==0)System.out.println(stk.pop());
			else stk.push(t);
		}
		in.close();
	}

}
