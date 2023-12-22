import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(in.readLine());
			for (int i = 0; i < T; i++) {
				String[] sar = in.readLine().split(" ");
				int[] side = new int[3];
				for (int j = 0; j < 3; j++) {
					side[j] = Integer.parseInt(sar[j]);
				}
				Arrays.sort(side);
				if (side[0] * side[0] + side[1] * side[1] == side[2] * side[2]) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}