import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long x = scanner.nextLong();
		long k = scanner.nextLong();
		
		scanner.close();
		
		long result;
		
		if (k == 1) {
			System.out.println(0);
		} else if (x == k) {
			System.out.println(0);
		} else {
			result = x;
			do {
				result = x;
				x = Math.abs(x - k);
			} while (result > x);
			
			System.out.println(result);
		}
	}

}
