import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long K = sc.nextLong();
			long a = B + C;
			long b = A + C;
			long c = A + B;
			long ans = A - B;
			System.out.println(ans);
		} catch (Exception e) {
			System.out.println("Unfair");
		}
	}
}