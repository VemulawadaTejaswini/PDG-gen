import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int W = reader.nextInt();
		int H = reader.nextInt();
		int[][] table = new int[H][W];
		for (int i = 0; i < H; i++) {

		}
//		int corner = 4; //flont, 4
//		int sides = (W - 2) * 2 + (H - 2) * 2; //front, 6;
		int others = Math.abs((W-2) * (H-2)); //back, 9
		System.out.println(others);
		reader.close();
	}
}
