import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			}
		}
		
		int sum = 0;
		if (count == 8) {
			sum++;
		}
		System.out.println(sum);
		scanner.close();
	}
}
