import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String x = sc.next();
		int b = sc.nextInt();
		while(x != "?") {
			int ans = 0;
			if(x == "+") {
				ans = a + b;
			} else if(x == "-") {
				ans = a - b;
			} else if(x == "*") {
				ans = a * b;
			} else if(x == "/") {
				ans = a / b;
			}
			System.out.println(ans);
			a = sc.nextInt();
			x = sc.next();
			b = sc.nextInt();
		}
	}
}