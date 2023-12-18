import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		String[] aline = br.readLine().split(" ");

		int point1 = 0;
		for (int i = 0; i < n; i++) {
			if (aline[i] == "1") {
				point1 = i;
			}
		}

		int count = point1 / (k - 1) + (n - point1) / (k - 1);

		System.out.println(count);

	}

}
