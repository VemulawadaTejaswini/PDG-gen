import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b && a < c) {
			System.out.print(a + " ");
			if (b < c) {
				System.out.println(b + " " + c);
			} else {
				System.out.println(c + " " + b);
			}
		} else if (b < a && b < c) {
			System.out.print(b + " ");
			if (a < c) {
				System.out.println(a + " " + c);
			} else {
				System.out.println(c + " " + a);
			}
		} else {
			System.out.print(c + " ");
			if (a < b) {
				System.out.println(a + " " + b);
			} else {
				System.out.println(b + " " + a);
			}
		}
	}

}