public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		if (c - a- b > 0 && (4*a*b)<Math.pow(c-a-b,2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}