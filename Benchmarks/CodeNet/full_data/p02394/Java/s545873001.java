//Circle in a Rectangle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] WHxyr = in.readLine().split(" ");

		int W = Integer.parseInt(WHxyr[0]);
		int H = Integer.parseInt(WHxyr[1]);
		int x = Integer.parseInt(WHxyr[2]);
		int y = Integer.parseInt(WHxyr[3]);
		int r = Integer.parseInt(WHxyr[4]);

		if (x - r >= 0 && y - r >= 0 && x + r <= W && y + r <= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}