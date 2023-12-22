import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,b;
		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {

			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());

			System.out.println(a + b);

		}
	}
}