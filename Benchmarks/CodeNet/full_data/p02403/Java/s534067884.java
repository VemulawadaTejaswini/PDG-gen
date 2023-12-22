import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int W = scn.nextInt();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

