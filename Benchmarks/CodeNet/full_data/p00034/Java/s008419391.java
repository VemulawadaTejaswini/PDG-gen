import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int[] l = new int[10];
		int[] v = new int[2];

		while ((line = br.readLine()) != null) {
			String[] data = line.trim().split(",");
			int distance = 0;
			for (int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(data[i]);
				distance += l[i];
			}
			for (int i = 0; i < 2; i++)
				v[i] = Integer.parseInt(data[i + 10]);
			double see = distance * ((double) v[0] / (v[1] + v[0]));

			for (int i = 0; i < 10; i++) {
				if (see - l[i] > 0) {
					see -= l[i];
				} else {
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}