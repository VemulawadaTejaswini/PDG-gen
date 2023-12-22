public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int tmp;
		if (b < a) {
			tmp = b;
			b = a;
			a = tmp;
		}
		if (c < b) {
			tmp = c;
			c = b;
			b = tmp;
		}
		if (b < a) {
			tmp = b;
			b = a;
			a = tmp;
		}
		System.out.println(a+" "+b+" "+c);
	}
}