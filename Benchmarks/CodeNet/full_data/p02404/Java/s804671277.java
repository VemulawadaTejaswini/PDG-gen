import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, W;

		while(true) {

			H = sc.nextInt();
			W = sc.nextInt();

			if (H == 0 && W == 0) {
				sc.close();
				break;
			}

			for(int hight_count = 0; hight_count < H; hight_count++) {
				for(int width_count = 0; width_count < W; width_count++) {
					if(hight_count == 0 || hight_count == H-1) {
						System.out.printf("#");
					} else if(width_count == 0 || width_count == W -1) {
						System.out.printf("#");
					} else {
						System.out.printf(".");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}

