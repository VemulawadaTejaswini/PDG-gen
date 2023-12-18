import java.util.Scanner;

public class Main {

	private static final long x = 1000000000 + 7;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long result = 1;
		for(int i=2;i<=n;i++){
			result *= i;
			result %= x;
		}
		System.out.println(result);
	}

}
