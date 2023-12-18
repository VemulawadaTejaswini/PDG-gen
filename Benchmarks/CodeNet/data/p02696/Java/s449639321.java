public class Main {

	static long mod = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] t = sc.nextLine().split(" ");
		long a = Long.parseLong(t[0]);
		long b = Long.parseLong(t[1]);
		long c = Long.parseLong(t[2]);

		long ans = 0;

		double d = Math.floorDiv(a, b) - a * Math.floorDiv(1, b);


			ans = (long) Math.floor(a * c / b) - a * Math.floorDiv(c, b);
			ans = Math.max(ans, (long) Math.floor(a * 1 / b) - a * Math.floorDiv(1, b));


		System.out.println(ans);
	}
}
