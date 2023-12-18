import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] text = br.readLine().split(" ");
		int[] range_numbers = { Integer.valueOf(text[0]), Integer.valueOf(text[1]) };
		int result = 0;
		for (int a = 1; a <= range_numbers[0]; a++) {
			for (int b = 1; b <= range_numbers[0]; b++) {
				if (a % b >= range_numbers[1]) result++;
			}
		}
		System.out.println(result);
	}
}