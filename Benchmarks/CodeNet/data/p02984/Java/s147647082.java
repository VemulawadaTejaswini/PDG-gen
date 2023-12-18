import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		line = reader.readLine();
		int[] dam = new int[N];
		long[] yama = new long[N];
		for (int i = 0; i < N; i++) {
			String[] str = line.split(" ");
			dam[i] = Integer.parseInt(str[i]);
			if (i % 2 == 0) {
				yama[0] += dam[i];
			}
			else {
				yama[0] -= dam[i];
			}
		}
		//yama[4] = 2*dam[3] - yama[3];
		for (int i = 0; i < N-1; i++) {
			yama[i+1] = 2*dam[i] - yama[i];
			System.out.print(yama[i] + " ");
		}
		System.out.println(yama[N-1]);
	}
}