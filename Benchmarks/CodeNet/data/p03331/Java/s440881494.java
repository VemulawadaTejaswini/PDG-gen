public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt()));
	}

	public static int calc(int n) {
		int res = n;
		for (int a = 1; a < n; a++) {			
			int b = n - a;
			int cal = Main.calcKeta(a) + Main.calcKeta(b);
			res = Math.min(cal, res);
		}

		return res;
	}

	private static int calcKeta(int n) {
		return (n == 0) ? 0 : n % 10 + Main.calcKeta(n / 10);
	}
}