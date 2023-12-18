import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ret = (long) Math.pow(2, (long) N / 2);
		ret = (long) ret % 1000000007;
		System.out.println(ret);

	}
}