import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		
		scanner.close();
		
		if (H%2 == 0) {
			System.out.println(H/2 * W);
		} else {
			if (W%2 == 0) {
				
				int a = (H/2 + 1) * ((W/2 + 1) * (W/2));
				int b = (H/2) * (W/2);
				System.out.println(a + b);
			} else {
				
				int a = (H/2 + 1) * (W/2 + 1);
				int b = (H/2) * (W/2);
				System.out.println(a + b);
			}
		}
	}

}
