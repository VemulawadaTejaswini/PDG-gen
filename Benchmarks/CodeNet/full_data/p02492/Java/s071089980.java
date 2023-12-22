import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true){
			int a = in.nextInt();
			String op = in.next();
			int b = in.nextInt();
			if(op.equals("?")) break;
			
			int ans = 0;
			if(op.equals("+")) ans = a + b;
			if(op.equals("-")) ans = a - b;
			if(op.equals("*")) ans = a * b;
			if(op.equals("/")) ans = a / b;
			
			System.out.println(ans);
		}
	}

}