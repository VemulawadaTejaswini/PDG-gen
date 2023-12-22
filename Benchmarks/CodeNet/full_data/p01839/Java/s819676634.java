
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Stack<String> stk=new Stack<>();
		boolean J=true;
		for(int i=0;i<n;i++) {
			String str=in.next();
			
			if(str.equals("A")) stk.push("A");
			else {
				if(stk.isEmpty()) {
					J=false;
					break;
				}
				else stk.pop();
			}
		}
		
		if(J && stk.isEmpty())System.out.println("YES");
		else System.out.println("NO");
	}

}

