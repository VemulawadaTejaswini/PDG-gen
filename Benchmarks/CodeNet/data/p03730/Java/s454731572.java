
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt()
				, b = scanner.nextInt()
				, c = scanner.nextInt();
		
		String ans = "NO";
		for (int i = 0;; i++) {
			if (i*a%b==c) {
				ans = "YES";
				break;
			}
			if (i*a>a*b) {
				break;
			}
		}
		System.out.println(ans);
		
		
		scanner.close();
	}
}
