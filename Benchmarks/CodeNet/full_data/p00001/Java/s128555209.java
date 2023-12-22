import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] a) {

		Integer[] mountains = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			try {
				mountains[i] = Integer.parseInt(a[i]);
			} catch (NumberFormatException e) {
				throw new RuntimeException(e);
			}
		}
		Arrays.sort(mountains, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(mountains[i]);
	}
}