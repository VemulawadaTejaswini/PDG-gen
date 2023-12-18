import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();
		double da = Math.sqrt(a);
		double db = Math.sqrt(b);
		double dc = Math.sqrt(c);

		if ((da + db) < dc) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
