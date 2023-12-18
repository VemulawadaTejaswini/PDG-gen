import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		
		if (a == 2 && b == 2) {
			System.out.println("Yes");
		} else if ((a == 4 || a == 6 || a == 9 || a == 11) || (b == 4 || b == 6 || b == 9 || b == 11)) {
			System.out.println("Yes");
		} else if ((a != 4 || a != 6 || a != 9 || a != 11 || a != 2) || (b != 4 || b != 6 || b != 9 || b != 11 || b != 2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}