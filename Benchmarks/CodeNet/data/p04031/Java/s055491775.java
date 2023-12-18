import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		double ave = Arrays.stream(num).average().getAsDouble();
		long a = Math.round(ave);
		long ans = 0L;
		for(int i : num) {
			ans += Math.pow(a-i, 2);
		}
		System.out.println(ans);
	}
}
