import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int H =scane.nextInt();
		int W =scane.nextInt();;

		do {

			for(int i =0; i<H; i++){
				for (int j = 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();

			H = scane.nextInt();

			W= scane.nextInt();


		} while (H !=0 && W !=0);
	}
}