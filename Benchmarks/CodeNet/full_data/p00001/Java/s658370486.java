import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		int[] rank = new int[3];
		for (int i = 0; i < 10; i++) {
			int v = readInt();
			for (int j = 0; j < rank.length; j++) {
				if (v > rank[j]) {
					int pre = rank[j];
					rank[j] = v;
					v = pre;
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(rank[i]);
		}

	}

	private final static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	private static int readInt() throws IOException {
		return Integer.parseInt(br.readLine(), 10);
	}

}