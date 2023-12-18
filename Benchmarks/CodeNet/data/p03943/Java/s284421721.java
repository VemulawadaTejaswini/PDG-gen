public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a == b + c)
			System.out.println("yes");
		else if (b == a + c)
			System.out.println("yes");
		else if (c == b + a)
			System.out.println("yes");
		else
			System.out.println("no");
		in.close();

	}
}