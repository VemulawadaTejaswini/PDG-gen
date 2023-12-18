import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = num.length - 1; i >= 0; i = i - 2) {
			if (i != num.length - 1) {
				System.out.print(" ");
			}
			System.out.print(num[i]);
		}
		for (int i = 0; i < num.length; i = i + 2) {
			System.out.print(" ");
			System.out.print(num[i]);
		}
		System.out.println();
		scanner.close();
	}
}
