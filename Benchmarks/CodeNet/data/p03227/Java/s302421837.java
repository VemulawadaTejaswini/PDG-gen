import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		if (N.length() > 2) {
			System.out.print(new StringBuilder(N).reverse().toString());
		} else {
			System.out.println(N);
		}
	}
}