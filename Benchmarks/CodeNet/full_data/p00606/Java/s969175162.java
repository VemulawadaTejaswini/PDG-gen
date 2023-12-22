import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static byte charger;
	static byte storeroom;
	static double probability;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		byte battery;
		byte start;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if ((battery = Byte.parseByte(line)) == 0) {
				break;
			}

			line = br.readLine();
			start = (byte) (line.toCharArray()[0] - 'A');
			charger = (byte) (line.toCharArray()[2] - 'A');
			storeroom = (byte) (line.toCharArray()[4] - 'A');

			probability = 0;
			clean(start, battery, 1);
			System.out.println(probability);
		}
	}

	static void clean(byte current, int battery, double p) {
		if (battery == 0) {
			if (current == charger) {
				probability += p;
			}
			return;
		} else if (battery == 1) {
			boolean b = false;
			for (byte n : next(current)) {
				b |= (n != charger);
			}
			if (!b)
				return;
		} else {
			for (byte n : next(current)) {
				if (n < 0 || n == storeroom) {
					clean(current, battery - 1, p / 4);
				} else {
					clean(n, battery - 1, p / 4);
				}
			}
		}
	}

	static byte[] next(byte current) {
		// 東,西,南,北
		final byte nexts[][] = {//
		{ 1, -1, 3, -1 },// 0
				{ 2, 0, 4, -1 },// 1
				{ -1, 1, 5, -1 },// 2
				{ 4, -1, 6, 0 },// 3
				{ 5, 3, 7, 1 },// 4
				{ -1, 4, 8, 2 },// 5
				{ 7, -1, -1, 3 },// 6
				{ 8, 6, -1, 4 },// 7
				{ -1, 7, -1, 5 },// 8
		};

		byte[] result = null;

		switch (current) {
		case 0:
			result = nexts[0];
			break;
		case 1:
			result = nexts[1];
			break;
		case 2:
			result = nexts[2];
			break;
		case 3:
			result = nexts[3];
			break;
		case 4:
			result = nexts[4];
			break;
		case 5:
			result = nexts[5];
			break;
		case 6:
			result = nexts[6];
			break;
		case 7:
			result = nexts[7];
			break;
		case 8:
			result = nexts[8];
			break;
		}
		return result;
	}
}