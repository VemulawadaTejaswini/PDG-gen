import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int b;
		b = sc.nextInt();
		System.out.print(a * b);
		System.out.print(2 + (a * b));
	}
}