import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long ans = 0;
		long num = 10;
		while (num <= N) {
			ans += N / num;
			num *= 5;
		}
		System.out.println(ans);
		in.close();
	}
}