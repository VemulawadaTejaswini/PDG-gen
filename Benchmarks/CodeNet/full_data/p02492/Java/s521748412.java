import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int ans = 0;
			if(op.equals("+")) {
				ans = a + b;
			} else if(op.equals("-")) {
				ans = a - b;
			} else if(op.equals("*")) {
				ans = a * b;
			} else if(op.equals("/")) {
				ans = a / b;
			} else if(op.equals("?")) {
				break;
			}
			System.out.println(ans);
		}
	}
}