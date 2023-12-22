public class Main {

	public static void main(String[] args) {
		int a = 1, i = 1;
		while (a != 0) {
			java.util.Scanner scan = new java.util.Scanner(System.in);
			String a1 = scan.next();
			a = Integer.parseInt(a1);
			if (a == 0) break;
			System.out.println("Case " + i + ": " + a);
			i++;
		}
	}
}