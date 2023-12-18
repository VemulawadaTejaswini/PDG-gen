import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		double n = (c - a - b) * (c - a - b) / 4.0;

		if(a * b < n) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}
}