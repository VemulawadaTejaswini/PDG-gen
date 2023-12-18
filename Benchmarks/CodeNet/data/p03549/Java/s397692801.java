import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int m = read.nextInt();
		System.out.println((1900 * m + 100 * (n - m)) * (1 << m));
	}
}
