import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		divisors();

	}
	
	public static void divisors() {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int divisors = 0;
		
		for (int i = a; i <= b; i++) {
			
			if (c % i == 0) {
				divisors++;
			}
		}
		
		System.out.println(divisors);
	}
}
