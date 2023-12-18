import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		
		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans = ans * i % 1000000007;
		}
		System.out.println(ans);
	}
}
