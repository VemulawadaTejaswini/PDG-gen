import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		for (int i = 0; i < h; i++) {
			int k = i % 2;
			for (int j = 0; j < w; j++)
				k = printChessboard(k);
			System.out.println();
		}
	}

	public static int printChessboard(int k) {
		switch (k) {
		case 0:
			System.out.print("#");
			return 1;
		case 1:
			System.out.print(".");
			return 0;
		}
		return -1;
	}
}