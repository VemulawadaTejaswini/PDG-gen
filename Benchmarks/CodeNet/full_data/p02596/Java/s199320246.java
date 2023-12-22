import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long k = sc.nextLong();
		
		long num = 0;
		for (int i = 0; i <= 18; i++) {
			
			num += 7 * (long) Math.pow(10, i);
			
			if (num % k == 0) {
				System.out.println(i + 1);
				return;
			}
			
		}
			
		System.out.println(-1);
		return;
	}
}
