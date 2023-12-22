import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	final static byte nexts[][] = {
			// 東,西,南,北
			{ 1, -1, 3, -1 },// 0:A
			{ 2, 0, 4, -1 }, // 1:B
			{ -1, 1, 5, -1 },// 2:C
			{ 4, -1, 6, 0 }, // 3:D
			{ 5, 3, 7, 1 }, // 4:E
			{ -1, 4, 8, 2 }, // 5:F
			{ 7, -1, -1, 3 },// 6:G
			{ 8, 6, -1, 4 }, // 7:H
			{ -1, 7, -1, 5 } // 8:I
	};
	final static byte distances[][] = {
			// A,B, C, D, E, F, G, H, I
			{ 0, 1, 2, 1, 2, 3, 2, 3, 4 },// 0:A
			{ 1, 0, 1, 2, 1, 2, 3, 2, 3 },// 1:B
			{ 2, 1, 0, 3, 2, 1, 4, 3, 2 },// 2:C
			{ 1, 2, 3, 0, 1, 2, 1, 2, 3 },// 3:D
			{ 2, 1, 2, 1, 0, 1, 2, 1, 2 },// 4:E
			{ 3, 2, 1, 2, 1, 0, 3, 2, 1 },// 5:F
			{ 2, 3, 4, 1, 2, 3, 0, 1, 2 },// 6:G
			{ 3, 2, 3, 2, 1, 2, 1, 0, 1 },// 7:H
			{ 4, 3, 2, 3, 2, 1, 2, 1, 0 } // 8:I
	};

	static byte charger;
	static byte storeroom;
	static int probability;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			byte battery;
			byte start;

			battery = Byte.parseByte(line);
			if (battery == 0) {
				break;
			}

			line = br.readLine();
			start = (byte) (line.toCharArray()[0] - 'A');
			charger = (byte) (line.toCharArray()[2] - 'A');
			storeroom = (byte) (line.toCharArray()[4] - 'A');

			probability = 0;
			clean(start, battery, 1 << battery * 2);
			System.out.println(String.format("%.8f",
					probability * Math.pow(4, -battery)));
		}
	}

	static void clean(byte current, int battery, int p) {
		if (battery == 0) {
			if (current == charger) {
				probability += p;
			}
			return;
		}
		if (distance(current, charger) <= battery) {
			for (byte n1 : next(current)) {
				if (n1 < 0 || n1 == storeroom) {
					for (byte n2 : next(current)) {
						if (n2 != n1 && n2 != storeroom)
							clean(n2, battery - 2, (p >> 2) - (p >> 4));
					}
				} else {
					clean(n1, battery - 1, p >> 2);
				}
			}
		}
	}

	static byte[] next(byte current) {
		return nexts[current];
	}

	static byte distance(byte current, byte charger) {
		return distances[current][charger];
	}
}