import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(W*H/2.0);
		if(x == 0 || y == 0 || x == W || y == H || (x*2 == W && y*2 == H)) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
}