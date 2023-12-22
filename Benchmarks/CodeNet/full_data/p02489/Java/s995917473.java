import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		while (a != 0) {
			for (int i = 0; i < 1000; i++) {
				System.out.printf("Case i:%d\n", a);
				a = scan.nextInt();
			}
		}
	}
}