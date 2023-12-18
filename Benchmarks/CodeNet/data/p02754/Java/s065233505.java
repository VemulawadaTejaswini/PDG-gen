import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long total = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		
		long k = total/(a+b);
		long ans = k*a + (total-k*(a+b));
		System.out.println(ans);

	}	
	
}