import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		for(int i=0;i<Math.min(a, b);i++) {
			System.out.print(Math.max(a, b));
		}
		System.out.println();

	}
}