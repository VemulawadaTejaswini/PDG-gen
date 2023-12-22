import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String integers = br.readLine();
			System.out.println(sort(toIntArray(integers)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int[] toIntArray(String stringArray) {
		String[] integerss = stringArray.split(" ");
		int[] IntArray = new int[3];
		IntArray[0] = Integer.parseInt(integerss[0]);
		IntArray[1] = Integer.parseInt(integerss[1]);
		IntArray[2] = Integer.parseInt(integerss[2]);
		return IntArray;
	}

	private static String sort(int[] integers) {
		for (int i = 0; i < integers.length - 1; i++) {
			int a = integers[i];
			int b = integers[i + 1];
			if (a > b) {
				integers[i] = b;
				integers[i + 1] = a;
				for (int j = i; j > 0; j--) {
					int c = integers[j];
					int d = integers[j - 1];
					if (c < d) {
						integers[j] = d;
						integers[j - 1] = c;
					} else {
						break;
					}
				}
			}
		}
		return String.valueOf(integers[0]) + " " + integers[1] + " " + integers[2];
	}
}
