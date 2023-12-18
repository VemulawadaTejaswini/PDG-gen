import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sumOfSum = 0;
		for (int i = 0; i <= n; i++) {
			int sum = 0;
			for (int j : Main.split(i)) {
				sum += j;
			}

			if (a <= sum && sum <= b) {
				sumOfSum += i;
			}
		}
		System.out.println(sumOfSum);

		scanner.close();
	}
	
	public static int[] split(int number) {
		int degits = String.valueOf(number).length();
		int[] numbers = new int[degits];
		
		for (int i = degits - 1; i >= 0; i--) {
			numbers[i] = number % 10;
			number /= 10;
		} 
		
		return numbers;
	}
}