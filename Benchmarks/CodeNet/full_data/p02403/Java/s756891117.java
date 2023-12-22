import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] cut = br.readLine().split(" ");
			int H = Integer.parseInt(cut[0]);
			int W = Integer.parseInt(cut[1]);
			if (H == 0 && W == 0)
				break;
			for (int j = 0; j < H; j++) {
				for (int i = 0; i < W; i++) {
					System.out.print("#");
				}
				System.out.print("\n");
			}
		}

	}
}