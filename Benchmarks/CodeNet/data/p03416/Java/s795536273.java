import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		for (int i = A; i <= B; i++) {
			int digit1 = i / 10000;
			int digit2 = i / 1000 % 10;
			int digit4 = i / 10 % 10;
			int digit5 = i % 10;
			if (digit1 == digit5 && digit2 == digit4) {
				result++;
			}
		}
		System.out.println(result);
	}
}
