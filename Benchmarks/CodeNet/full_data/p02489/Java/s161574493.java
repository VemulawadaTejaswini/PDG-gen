public class Main {
	public static void main(String[] args) {
		int i = 1;
		java.util.Scanner in = new java.util.Scanner(System.in);
		while (true) {
			String str1 = in.next();
			int x = java.lang.Integer.parseInt(str1);
			if (x == 0) break;
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}