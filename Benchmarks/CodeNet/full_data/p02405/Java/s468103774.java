import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String[] input = in.split("");
		int height = Integer.parseInt(input[0]);
		int width = Integer.parseInt(input[1]);

		if ((height == 0) && (width == 0)) {
			for (int i = 0; i <= height; i++) {
				if (i % 2 != 0) {// ?\???°???
					for (int j = 0; j < width; j++) {
						System.out.print("#");
						j++;
						System.out.print(".");
					}
				} else {// ??¶??°???
					for (int j = 0; j < width; j++) {
						System.out.print(".");
						j++;
						System.out.print("#");
					}
					System.out.println();
				}
			}
		}
	}
}