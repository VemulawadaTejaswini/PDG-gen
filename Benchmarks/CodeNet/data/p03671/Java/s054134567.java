import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int r = Math.min(a+b, b+c);
		int r1 = Math.min(r, c+a);
		System.out.println(r1);
	}
}
