import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] data = str.split(",");
			int[] length = new int[10];
			int allLength = 0;
			for (int i = 0; i < 10; i++) {
				length[i] = Integer.parseInt(data[i]);
				allLength += length[i];
			}
			int v1 = Integer.parseInt(data[10]);
			int v2 = Integer.parseInt(data[11]);
			double l = (double) v1 * allLength / (v1 + v2);
			int i = 0;
			while (l > length[i]) {
				l -= length[i];
				i++;
			}
			System.out.println(i + 1);
			str = br.readLine();
		}
	}
}