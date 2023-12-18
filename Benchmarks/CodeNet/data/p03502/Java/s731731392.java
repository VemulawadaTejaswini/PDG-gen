public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt())?"Yes":"No");
	}

	public static boolean calc(int x) {
		return x%Main.calcKeta(x)==0;
	}

	public static int calcKeta(int n) {
		return (n == 0) ? 0 : n % 10 + Main.calcKeta(n / 10);
	}
}