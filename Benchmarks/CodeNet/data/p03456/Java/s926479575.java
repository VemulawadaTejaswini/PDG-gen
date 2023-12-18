import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String numString = a+b;
		int num = Integer.parseInt(numString);
		if((Math.sqrt(num))%1 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
