import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int x1, y1, x2, y2;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] coor = in.readLine().split(" ");
		x1 = Integer.parseInt(coor[0]);
		y1 = Integer.parseInt(coor[1]);
		x2 = Integer.parseInt(coor[2]);
		y2 = Integer.parseInt(coor[3]);
		System.out.println(Math.sqrt(Math.pow(Math.abs(x2 - x1), 2)
				+ Math.pow(Math.abs(y2 - y1), 2)));
	}
}