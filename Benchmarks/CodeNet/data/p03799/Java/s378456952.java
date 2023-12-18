import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long res = Math.min(n, m / 2) + (m - Math.min(n, m / 2) * 2) / 4;
		System.out.println(res);
	}
}
