import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int result = 0;
			if(op == "?") break;
			else if(op.equals("+")){
				result = a + b;
			}
			else if(op.equals("-")){
				result = a - b;
			}
			else if(op.equals("*")){
				result = a * b;
			}
			else if(op.equals("/")){
				if(b == 0) break;
				result = a / b;
			}
			System.out.println(result);
		}
	}

}