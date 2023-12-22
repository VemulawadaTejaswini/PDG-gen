
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if ((N & 1) != 1) {
			int x = 2;
			int y = N - 1;
			while (M-- > 0) {
				System.out.println(x + " " + y);
				x++;
				y--;
			}
		} else {
			int x = 1;
			int y = N - 1;
			while (M-- > 0) {
				System.out.println(x + " " + y);
				x++;
				y--;
			}
		}

	}

}
