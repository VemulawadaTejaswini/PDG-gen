public class Main {
	public static void main(String[] args) {
		Scanner in = new java.util.Scanner(System.in);
		int a = (int)in.nextInt();
		int b = (int)in.nextInt();
		int menseki = a * b;
		int mawari = 2 * (a + b);
		System.out.println(menseki + "と" + mawari);
	}
}