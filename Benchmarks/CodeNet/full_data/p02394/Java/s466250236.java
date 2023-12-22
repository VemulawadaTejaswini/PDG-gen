import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if ((r - x) > 0 || (r + x) > W || (r - y) > 0 || (r + y) > H) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}