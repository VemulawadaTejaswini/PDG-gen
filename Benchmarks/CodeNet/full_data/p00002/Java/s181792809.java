import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dataNum = 0;
		while (dataNum <= 200) {
			int a = Integer.parseInt(br.readLine().split(" ")[0]);
			int b = Integer.parseInt(br.readLine().split(" ")[1]);

			if ((a == 0) && (b == 0)) break;
			if (!((a >= 0 && a <= 1000000) && (b >= 0 && b <= 1000000))) break;

			System.out.println(String.valueOf(a * b).length());

			dataNum++;
		}
	}
}