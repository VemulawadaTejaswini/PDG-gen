import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if(op == "?") {
				break;
				
			}else if(op == "+") {
				System.out.println(a + b);
				
			}else if(op == "-") {
				System.out.println(a - b);
				
			}else if(op == "*") {
				System.out.println(a * b);
				
			}else if(op == "/") {
				System.out.println(a / b);
				
			}else {
				break;     //これ必要ないかもしれない
			}
		}
		
				
	}
}
