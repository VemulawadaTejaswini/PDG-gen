import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int[] a = new int[4];
			int[] b = new int[4];
			int hit = 0;
			int blow = 0;

			String[] as = line.split(" ");
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(as[i]);
			}

			String[] bs = br.readLine().split(" ");
			for (int i = 0; i < b.length; i++) {
				b[i] = Integer.parseInt(bs[i]);
			}

			//
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j] && i == j)
						hit++;
					else if (a[i] == b[j] && i != j)
						blow++;
				}
			}
			//
			System.out.println(hit + " " + blow);
		}
	}
}