import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		if (v <= w) {
			System.out.println("NO");
			return;
		}

		long d1 = Math.abs(a - b);
		if (d1 % (v - w) == 0) {
			long q = d1 / (v - w);
			System.out.println(q <= t ? "YES" : "NO");
		} else {
			System.out.println("NO");
		}
	}

}
