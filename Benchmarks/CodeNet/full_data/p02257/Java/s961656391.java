import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			int num = sc.nextInt();
			if (isPrime(num)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isPrime(int i) {
		
		boolean prime = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) prime = false;
		}
		return prime;
	}
}