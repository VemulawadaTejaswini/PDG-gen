public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		long d = c-a-b;
		if (d > 0 && 4*a*b<d*d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}