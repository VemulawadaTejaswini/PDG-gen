import java.util.*;

public class AOJ10014 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 && w == 0)
				break;
			for (int i = 0; i < h; i++) {
				int k = i % 2;
				for (int j = 0; j < w; j++)
					k = printChessboard(k);
				System.out.println();
			}
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