import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] a) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Integer[] mountains = new Integer[10];
		for (int i = 0; i < 10; i++) {
			try {
				mountains[i] = Integer.parseInt(input.readLine());
			} catch (NumberFormatException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println(Arrays.toString(mountains));
		Arrays.sort(mountains, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(mountains[i]);
	}
}