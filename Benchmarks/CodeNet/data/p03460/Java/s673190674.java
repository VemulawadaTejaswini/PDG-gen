import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in))) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			int K2 = K * 2;
			int[] X = new int[N];
			int[] Y = new int[N];
			boolean[] C = new boolean[N];
			for (int i = 0; i < N; i++) {
				input = reader.readLine().split(" ");
				X[i] = Integer.parseInt(input[0]);
				Y[i] = Integer.parseInt(input[1]);
				C[i] = "W".equals(input[2]) ? false : true;
			}

			int max = 0;
			for (int i = 0; i < K2; i++) {
				for (int j = 0; j < K2; j++) {
					int count = 0;
					for (int n = 0; n < N; n++) {
						int tmpX = (X[n] + i) % K2;
						int tmpY = (Y[n] + j) % K2;
						boolean color = tmpX < K && tmpY < K || tmpX >= K && tmpY >= K;
						if (color == C[n]) {
							count++;
						}
					}
					max = max < count ? count : max;
				}
			}
			System.out.println(max);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
