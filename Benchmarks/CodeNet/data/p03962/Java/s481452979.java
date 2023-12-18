import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] d = new int[101];
		int result = 0;
		if (a!=b && b!=c && c!=a) {
			result = 3;
		}
		if (a==b && b==c) {
			result = 1;
		}
		if ((a==b && b!=c) || (a!=b && b==c) || (c==a && a!=b)) {
			result = 2;
		}

		System.out.println(result);
	}

}
