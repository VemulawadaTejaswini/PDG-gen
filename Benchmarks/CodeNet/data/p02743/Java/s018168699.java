
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		long c = scanner.nextInt();
		
		if(4*a*b<(c-a-b)*(c-a-b) && Math.sqrt(c)-Math.sqrt(a)-Math.sqrt(b)>0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
