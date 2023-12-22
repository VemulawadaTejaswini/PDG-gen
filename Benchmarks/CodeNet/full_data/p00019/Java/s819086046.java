public class Main {
	static int n = new java.util.Scanner(System.in).nextInt();

	public static void main(String[] args) {

		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		System.out.println(ans);

	}
}