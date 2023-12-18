import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		br.readLine();
		// String[] aline = br.readLine().split(" ");

		int count = (n - 1) / (k - 1);
		if (0 < (n - 1) % (k - 1)) {
			count++;
		}

		System.out.println(count);

	}

}
