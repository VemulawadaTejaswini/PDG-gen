import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sqrt = (int) Math.sqrt(n);
		int count = 0;
		for (int i = 1; i <= sqrt && count <= 8; i++) {
			if (n % i == 0) {
				count += (i == sqrt) ? 1 : 2;
			}
		}
		System.out.println((count == 8) ? "1" : "0");
	}
}