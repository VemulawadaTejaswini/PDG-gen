
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		System.out.println((long)((1900 * M + (100 * (N - M))) * Math.pow(2, M)));
		scan.close();

	}

}
