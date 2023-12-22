import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int B = 4;
	private static final int F = 3;
	private static final int R = 10;

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][][] residence = new int[B][F][R];

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int b = Integer.parseInt(str[0]);
			int f = Integer.parseInt(str[1]);
			int r = Integer.parseInt(str[2]);
			int v = Integer.parseInt(str[3]);
			residence[b - 1][f - 1][r - 1] += v;
		}

		for (int i = 0; i < B; i++) {
			for (int j = 0; j < F; j++) {
				for (int k = 0; k < R; k++) {
					sb.append(" ").append(residence[i][j][k]);
				}
				sb.append("\n");
			}
			if (i != B - 1) {
				sb.append("####################").append("\n");
			}
		}

		System.out.print(sb);
	}

}