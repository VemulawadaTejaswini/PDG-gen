import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();

		for (int i = 0; i < times; i++) {
			int[] length = new int[3];
			for (int k = 0; k < 3; k++) {
				length[k] = in.nextInt();
				length[k] = (int) Math.pow(length[k], 2);
			}
			Arrays.sort(length);
			if (length[0] + length[1] == length[2]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}