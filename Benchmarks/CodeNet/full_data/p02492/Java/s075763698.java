import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(1){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int x = 0;
			if(op.equals("+")) {
				x = a + b;
			} else if(op.equals("-")) {
				x = a - b;
			} else if(op.equals("*")) {
				x = a * b;
			} else if(op.equals("/")) {
				x = a / b;
			} else if(op.equals("?")) {
				break;
			}
			System.out.println(x);
		}
	}
}