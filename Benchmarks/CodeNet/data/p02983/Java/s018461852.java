import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong() % 2019;
		long r = sc.nextLong() % 2019;
		if (r <= l) System.out.println(0);
		else System.out.println(l * (l + 1));
	}
}
