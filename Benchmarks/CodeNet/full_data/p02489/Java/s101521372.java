public class Main {

	public static void main(String[] args) {
		int a = 1;
		int i = 1;
		while (a != 0) {
			java.util.Scanner scan = new java.util.Scanner(System.in);
			String a1 = scan.next();
			a = Integer.parseInt(a1);
			if (a != 0)
				System.out.println("Case " + i + ": " + a);
			i++;
		}
	}

}