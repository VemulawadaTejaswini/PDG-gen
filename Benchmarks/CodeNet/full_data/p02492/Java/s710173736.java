import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while (true) {
			String op = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(op.equals("?")) return;
			if(op.equals("+")){
				System.out.println(a + b);
			}else if(op.equals("-")){
				System.out.println(a - b);
			}else if(op.equals("*")){
				System.out.println(a * b);
			}else if(op.equals("/")){
				System.out.println(a / b);
			}
		}
	}
}