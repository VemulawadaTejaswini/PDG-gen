
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long M = sc.nextLong();
		Long x = 1l;

		while (M-- > 0) {
			System.out.println(x + " " + --N);
			x++;
			N--;
		}

	}

}
