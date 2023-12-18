import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] matrix = new String[H];
		for (int i = 0; i < H; i++) {
			matrix[i] = sc.next();
		}
		int total = 1;
		int max = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (matrix[i].charAt(j) == '.') {
					for (int k = i + 1; k < H; k++) {
						if (matrix[k].charAt(j) == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int k = i - 1; k >= 0; k--) {
						if (matrix[k].charAt(j) == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int l = j + 1; l < W; l++) {
						if (matrix[i].charAt(l) == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int l = j - 1; l >= 0; l--) {
						if (matrix[i].charAt(l) == '.') {
							total++;
						} else {
							break;
						}
					}
					if (total > max) {
						max = total;
					}
					total = 1;

				}

			}
		}
		System.out.println(max);
	}

}