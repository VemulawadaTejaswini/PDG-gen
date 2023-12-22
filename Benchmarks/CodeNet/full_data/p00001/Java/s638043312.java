import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			while (null != (s = br.readLine())) {
				if (isNumber(s))
					list.add(Integer.valueOf(s));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Integer[] array = list.toArray(new Integer[0]);
		Arrays.sort(array);

		System.out.println(array[9]);
		System.out.println(array[8]);
		System.out.println(array[7]);

	}

	private static boolean isNumber(String s) {

		try {
			int n = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}