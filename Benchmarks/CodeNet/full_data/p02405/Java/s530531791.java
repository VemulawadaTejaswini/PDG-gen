import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] strArray = br.readLine().split(" ");
			int H = Integer.parseInt(strArray[0]);
			int W = Integer.parseInt(strArray[1]);

			if (H ==0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if ((i + j) %2 == 0) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}