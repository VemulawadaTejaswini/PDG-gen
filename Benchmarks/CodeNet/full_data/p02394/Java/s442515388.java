import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int W, H, x, y, r;

		Scanner scan = new Scanner(System.in);

		W = scan.nextInt();
		H = scan.nextInt();
		x = scan.nextInt();
		y = scan.nextInt();
		r = scan.nextInt();

		if (0 <= x-r && x+r <= W) {
			if(0 <= y-r && y+r <= H){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if(0 <= y-r && y+r <= H){
				System.out.println("No");
			} else {
				System.out.println("No");
			}
		}
	}
}