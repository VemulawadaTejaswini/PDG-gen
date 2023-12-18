import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xy = null;
		xy = br.readLine().split(" ");
		int hNum = Integer.parseInt(xy[0]);
		int wNum = Integer.parseInt(xy[1]);

		if (hNum == 1 || wNum == 1) {
			System.out.println(1);
		}

		if (( hNum * wNum ) % 2 == 0) { //偶数なら
			//入力された縦・横座標が偶数なら
			System.out.println(hNum * wNum / 2);
		} else {
			System.out.println(hNum * wNum / 2 + 1);
		}

	}
}
