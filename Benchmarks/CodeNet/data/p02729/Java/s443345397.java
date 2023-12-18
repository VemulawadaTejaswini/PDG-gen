import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int nAmount = getnc2(n);
		int mAmount = getnc2(m);

		System.out.println((nAmount + mAmount));
	}

	static int getnc2(int n) {
		return n * (n - 1) / 2;
	}
}