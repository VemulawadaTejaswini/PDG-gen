import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(op);
		
			if(op.equals("+")){
				System.out.println(a + op + b );
			}else if(op.equals("-")){
				System.out.println(a + op + b );
			}else if(op.equals("*")){
				System.out.println(a + op + b );
			}else if(op.equals("/")){
				System.out.println(a + op + b );
			}else{
				System.out.println("error");
			}
	}
}