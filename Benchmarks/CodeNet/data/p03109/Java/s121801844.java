import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int m = Integer.parseInt(str.substring(5, 7));
		int d = Integer.parseInt(str.substring(8, 10));
		if (m > 5 || (m >= 4 && d > 30)) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}
	}
}
