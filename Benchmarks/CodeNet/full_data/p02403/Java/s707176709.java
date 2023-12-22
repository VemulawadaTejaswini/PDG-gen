import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		for (int a = 0; a < H; a++) {
			for (int b = 0; b < W; b++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
