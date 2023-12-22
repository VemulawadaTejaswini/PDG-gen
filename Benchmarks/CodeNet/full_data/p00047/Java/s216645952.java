
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		int[] num = new int[3];
		num[0] = 1;
		while ((line = reader.readLine()) != null) {
			if (reader.readLine().isEmpty())
				break;
			if (line.equals("A,B") || line.equals("B,A")) {
				int t = num[0];
				num[0] = num[1];
				num[1] = t;
			} else if (line.equals("A,C") || line.equals("C,A")) {
				int t = num[0];
				num[0] = num[2];
				num[2] = t;
			} else {
				int t = num[1];
				num[1] = num[2];
				num[2] = t;
			}

		}
		int result = 0;
		for (int i = 0; i < 3; i++) {
			if (num[i] == 1) {
				result = i;
			}
		}
		System.out.println(result == 0 ? "A" : result == 1 ? "B" : "C");
	}
}