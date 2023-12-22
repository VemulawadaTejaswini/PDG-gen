import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int a = sc.nextInt();
			String op = sc.next();
			char o = op.charAt(0);
			int b = sc.nextInt();

		if(o == '?'){
			break;
		}
		else if(o == '-'){
			System.out.println(a - b);
		}
		else if(o == '*'){
			System.out.println(a * b);
		}
		else if(o == '/'){
			System.out.println(a / b);
		}
		else if(o == '+'){
			System.out.println(a + b);
		}
		
		}sc.close();
	}
}