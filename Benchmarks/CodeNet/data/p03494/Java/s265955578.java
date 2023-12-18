import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int count = 0;

			for (;; count++) {
				if (!can2Divs(A)) {
					break;
				}
			}

			System.out.println(count);
		}
	}

	private static boolean can2Divs(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = a[i] / 2;
			} else {
				return false;
			}
		}
		return true;
	}
}
