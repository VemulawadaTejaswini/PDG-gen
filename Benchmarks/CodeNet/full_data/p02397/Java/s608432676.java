import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		for (; ;) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			
			if (x == 0 && y == 0) break;
			
			if (x > y) {
				int t = y;
				y = x;
				x = t;
			}
			
			System.out.println(x + " " + y);
		}
	}
}

