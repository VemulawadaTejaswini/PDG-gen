import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, W;
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println("");
				System.out.println("");
			}
			if (H == 0 && W == 0) {
				break;
			}
		}
		sc.close();
	}
}

