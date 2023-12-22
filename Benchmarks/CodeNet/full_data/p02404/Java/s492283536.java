import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    while (true) {
		    String line = br.readLine();
		    int H = Integer.parseInt(line.split(" ")[0]);
		    int W = Integer.parseInt(line.split(" ")[1]);

		    if (H == 0 && W == 0) break;

		    display(H, W);
	    }
	}

	public static void display(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i == 0 || i == h - 1) {
					System.out.print("#");
				} else {
					if (j == 0 || j == w - 1) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
}