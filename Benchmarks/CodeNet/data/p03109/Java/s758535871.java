import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		s = s.substring(0,4) + s.substring(5,7) + s.substring(8,10);
		int n = Integer.parseInt(s);

		if (n <= 20190430) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
