import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long factorial = 1;
		for(int i = 1; i <= N; i++) {
			factorial = factorial * i % 1000000007;
			System.out.println(factorial);
		}
		System.out.println(factorial);
	}
}