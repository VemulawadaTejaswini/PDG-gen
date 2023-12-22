import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String op = scan.next();

		System.out.printf("%d" + "%s" + "%d", a, op, b);

		while(true){
			if(op == "+"){
				System.out.println(a + b);
			}else if(op == "-"){
				System.out.println(a - b);
			}else if(op == "*"){
				System.out.println(a * b);
			}else if(op == "/"){
				System.out.println(a / b);
			}else if(op == "?"){
				break;
			}
		}
	}
}