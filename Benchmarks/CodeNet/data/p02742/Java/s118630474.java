import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Long H = scanner.nextLong();
		Long W = scanner.nextLong();
		
		scanner.close();
		
		if (H%2 == 0) {
			System.out.println(H/2 * W);
		} else {
			if (W%2 == 0) {
				
				Long a = (H/2 + 1) * ((W/2 + 1) * (W/2));
				Long b = (H/2) * (W/2);
				System.out.println(a + b);
			} else {
				
				Long a = (H/2 + 1) * (W/2 + 1);
				Long b = (H/2) * (W/2);
				System.out.println(a + b);
			}
		}
	}

}
