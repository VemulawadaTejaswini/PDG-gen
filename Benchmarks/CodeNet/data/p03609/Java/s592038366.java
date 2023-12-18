
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int t = scan.nextInt();
		System.out.println(X - t > 0 ? (X - t) : 0);
		scan.close();

	}

}
