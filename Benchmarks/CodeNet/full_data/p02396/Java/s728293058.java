import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		for (int i = 1; ;i++) {
			int x  = stdIn.nextInt();
			
			if (x == 0) break;
			
			System.out.println("Case " + i + ": " + x);
		}
	}
}
