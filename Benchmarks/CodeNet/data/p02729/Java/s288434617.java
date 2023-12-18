import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;

		if(n > 1) {
			result += (n * (n - 1)) / 2;
		}

		if(m > 1) {
			result += (m * (m - 1)) / 2;
		}

		System.out.println(result);
		sc.close();
	}
}
