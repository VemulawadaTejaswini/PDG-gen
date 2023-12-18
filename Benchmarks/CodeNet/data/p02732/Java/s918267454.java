import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] counts = new int[200000];
		int[] numbers = new int[200000];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			numbers[i] = a;
			result += counts[a - 1];
			counts[a - 1]++;
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			int a = numbers[i];
			int c = counts[a - 1];
			System.out.println(result - (c - 1));
		}
	}
}
