import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		String op = scan.next();
		int b = Integer.parseInt(scan.next());
		while(!op.equals("?")){
			if(op.equals("+")){
				System.out.println(a+b);
			}
			else if(op.equals("-")){
				System.out.println(a-b);
			}
			else if(op.equals("*")){
				System.out.println(a*b);
			}
			else if(op.equals("/")){
				System.out.println(a/b);
			}
			a = Integer.parseInt(scan.next());
			op = scan.next();
			b = Integer.parseInt(scan.next());
		}
		scan.close();
	}

}