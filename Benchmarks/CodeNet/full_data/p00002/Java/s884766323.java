import java.util.Scanner;

class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String str;
		while ((a = sc.nextInt()) != 0) {
			b = sc.nextInt();
			str = String.valueOf(a + b);
			System.out.println(str);
		}
	}
}