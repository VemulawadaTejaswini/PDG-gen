import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> vals = new ArrayList<Integer>();
		while (in.hasNext()) {
			int val = in.nextInt();
			int keta = in.nextInt();
			if (val == 0 && keta == 0)
				break;
			vals.clear();
			int[] array = new int[keta];
			// Arrays.fill(array, 0);
			while (!vals.contains(val)) {
				vals.add(val);
				for (int k = 0; k < keta; k++) {
					array[k] = val % 10;
					val /= 10;
				}
				Arrays.sort(array);
				// System.out.println(Arrays.toString(array));
				for (int k = 0; k < keta; k++) {
					val *= 10;
					val += array[keta - 1 - k] - array[k];
				}
			}
			int i = vals.indexOf(val);
			int j = vals.size() - i;
			System.out.print(i);
			System.out.print(" ");
			System.out.print(val);
			System.out.print(" ");
			System.out.println(j);
		}
	}
}