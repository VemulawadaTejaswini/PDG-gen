import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		long a,b;
		String op;
		while(s.hasNext()) {
			a  = Integer.parseInt(s.next());
			op =                  s.next() ;
			if(op.equals("?"))
				return;
			b  = Integer.parseInt(s.next());

			switch (op) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println((int)(1.0*a/b));
				break;
			}
		}
	}
}