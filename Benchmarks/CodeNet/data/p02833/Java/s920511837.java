import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long ans = 0;
		long num = 5;
		while (num != 7450580596923828125l && num <= N) {
			ans += N / (num * 2);
			num *= 5;
		}
		System.out.println(ans);
		in.close();
	}
}