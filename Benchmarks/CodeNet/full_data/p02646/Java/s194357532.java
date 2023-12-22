import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		if (Math.abs(B - A) < (V - W) * T) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}