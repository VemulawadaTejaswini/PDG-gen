import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int[][] box = new int[n][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				box[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			Arrays.sort(box[i]);
			int a = box[i][0];
			int b = box[i][1];
			int c = box[i][2];
			if (c * c == a * a + b * b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

}