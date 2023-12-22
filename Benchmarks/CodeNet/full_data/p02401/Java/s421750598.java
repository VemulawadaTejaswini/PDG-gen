import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		String op = x.next();
		int b = x.nextInt();
		while(!op.equals("?")){
		if(op.equals("+")){
			System.out.println(a+b);
		}else if (op.equals("-")){
			System.out.println(a-b);
		}else if (op.equals("*")){
			System.out.println(a*b);
		}else if (op.equals("/")){
			System.out.println(a/b);
		}
		a = x.nextInt();
		op = x.next();
		b = x.nextInt();
		}
	}

}