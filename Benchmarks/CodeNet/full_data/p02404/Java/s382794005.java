import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, W;
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();

			if (H == 0 && W == 0)
				break;
			
			printFrame(H,W);

		}
	}

	public static void printFrame(int H, int W) {
		for (int i = 0; i < W; i++)
			System.out.print("#");

		System.out.println();

		for (int i = 2; i < H; i++) {
			for (int j = 1; j < W; j++) {
				if (j == 1)
					System.out.print("#");
				else if (j == (W - 1)){
					System.out.println("#");
					break;
				}

				System.out.print(".");
			}

		}
		for (int i = 0; i < W; i++)
			System.out.print("#");
		
		System.out.println();
		System.out.println();


	}

}