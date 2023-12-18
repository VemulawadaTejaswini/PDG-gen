import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b * 2) {
			int x = a - b * 2;
			System.out.println(x);
		} else if (a < b) {
			System.out.println(0);
		} else if (a < b * 2) {
			System.out.println(0);
		}
	}
}
