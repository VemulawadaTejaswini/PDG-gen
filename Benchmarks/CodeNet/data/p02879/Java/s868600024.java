import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		boolean judge = true;
		
		if (a > 9) {
			System.out.println(-1);
			judge = false;
		}
		if (b > 9) {
			System.out.println(-1);
			judge = false;
		}
		if (judge) {
			System.out.println(a * b);
		}
	}
}