import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int a = s.nextInt();
			String op = s.next();
			int b = s.nextInt();
			
			if(op.equals("+")) {
				System.out.println(a+b);
			} else if(op.equals("-")) {
				System.out.println(a-b);
			} else if(op.equals("*")) {
				System.out.println(a*b);
			} else if(op.equals("/")) {
				System.out.println(a/b);
			} else {
				break;
			}
			
		}
		s.close();
	}

}