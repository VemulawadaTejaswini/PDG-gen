public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int c = 0;
		for (int x = i; x <= j; x++) {

			if (x % k == 0) {
				c++;
			}
		}
		System.out.printf("%d\n", c);
		sc.close();
	}
}