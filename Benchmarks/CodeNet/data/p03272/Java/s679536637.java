
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int i = Integer.parseInt(scan.next());

		System.out.println(N - i + 1);
	}
}
