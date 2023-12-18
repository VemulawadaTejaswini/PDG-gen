import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long[] d = {a, b, c};
		Arrays.sort(d);
		long temp = d[0] * d[2];
		System.out.println(temp * ((b + 1) / 2) - temp * (b / 2));
	}
}
