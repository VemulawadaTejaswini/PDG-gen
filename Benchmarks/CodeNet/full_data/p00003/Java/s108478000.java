import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static String YES = "YES";
	private static String NO_ = "NO";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] isides = new int[3];
		String[] ssides = new String[3];

		while ((line = br.readLine()) != null) {
			try {
				ssides = line.split(" ");
				isides[0] = Integer.parseInt(ssides[0]);
				isides[1] = Integer.parseInt(ssides[1]);
				isides[2] = Integer.parseInt(ssides[2]);
				Arrays.sort(isides);
				if (Math.pow(isides[2], 2) == (Math.pow(isides[0], 2) + (Math
						.pow(isides[1], 2)))) {
					System.out.println(YES);
				} else {
					System.out.println(NO_);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;
			}
		}
	}
}