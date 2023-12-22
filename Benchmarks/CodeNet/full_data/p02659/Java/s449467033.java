import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		String sB = sc.next();
		long B = Integer.parseInt(sB.substring(0, 1)) * 100 +
				 Integer.parseInt(sB.substring(2, 3)) * 10 +
				 Integer.parseInt(sB.substring(3, 4));
		System.out.println((A * B / 100));

		sc.close();
	}
}
