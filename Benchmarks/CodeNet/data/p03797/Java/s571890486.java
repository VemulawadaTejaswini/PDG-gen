public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextInt();
		long c = sc.nextInt();

		long result = 0;
		if (c <= s * 2) {
			result = Math.round(c / 2);
			c = c % 2;
		} else {
			result = s;
			c = c - s * 2;
			result = result + c / 4;
		}

		System.out.println(result);
		sc.close();
	}
}