import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] array = new long[3];
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			if (n == 0) {
				break;
			}
			boolean nothingFlg = true;
			for (int i = 0; i < n; i++) {
				array = convertLong(sc.nextLine().split(" "));
				if ((array[1] * array[2]) >= 1000000) {
					System.out.println(array[0]);
					nothingFlg = false;
				}
			}
			if (nothingFlg) {
				System.out.println("NA");
			}
		}
	}

	private static long[] convertLong(String[] str) {
		long[] array = new long[str.length];
		for (int i = 0; i < str.length; i++) {
			array[i] = Long.parseLong(str[i]);
		}
		return array;
	}
}