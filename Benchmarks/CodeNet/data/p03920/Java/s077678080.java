import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		while(n >= 1) {
			long next = n / 2 + 1;
			System.out.println(next);
			n -= next;
		}
	}
}