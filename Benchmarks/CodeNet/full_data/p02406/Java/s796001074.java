import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x;
		for (int i = 1; i <= n; i++) {
			x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			
			do {
				if (x % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
				x /= 10;
			} while(x != 0);
		}
		System.out.println();
	}
}

