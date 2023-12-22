import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader sr = null;
		Scanner sc = null;

		try {
			sc = new Scanner(sr = new InputStreamReader(System.in));

			String[] str = sc.nextLine().split(" ");
			Integer[] values = toInteger(str);
			Arrays.sort(values, Collections.reverseOrder());

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < values.length; i++) {

				sb.append(values[i]);
				sb.append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb);

		}catch(NoSuchElementException e){

		}

		finally {
			sr.close();
			sc.close();
		}

	}

	public static Integer[] toInteger(String[] str) {

		List<Integer> list = new ArrayList<Integer>();

		for (String s : str) {

			list.add(Integer.parseInt(s));

		}

		return list.toArray(new Integer[0]);

	}
}