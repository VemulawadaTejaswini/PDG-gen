import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), x=sc.nextInt();
		System.out.println((b - a + 1) / x);
	}
}