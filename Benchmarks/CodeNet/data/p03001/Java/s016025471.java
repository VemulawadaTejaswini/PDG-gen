import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(W*H/2.0);
		if(2*x == W && 2*y == H) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}