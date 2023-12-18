public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt(), s.nextInt()));
	}

	public static int calc(int x, int a) {

		return (x<a)?0:10;
	}
}