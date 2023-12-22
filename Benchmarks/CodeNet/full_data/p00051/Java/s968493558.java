import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;

		try {

			sc = new Scanner(System.in);
			int dataSet = 0;
			char[] num = new char[8];
			Integer max = 0;
			Integer min = 0;
			Integer result = 0;

			while (sc.hasNext()) {
				dataSet = sc.nextInt();
				for (int i = 1; i <= dataSet; i++) {
					num = sc.next().toCharArray();

					max = sortDesc(num);
					min = sortAsc(num);
					result = max - min;

					System.out.println(result);
				}

			}

		} finally {
			sc.close();
		}

	}

	public static Integer sortAsc(char[] c) {

		Arrays.sort(c);
		return Integer.parseInt(String.valueOf(c));
	}

	public static Integer sortDesc(char[] c) {

		Arrays.sort(c);
		char[] result = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			result[result.length - (1 + i)] = c[i];
		}

		return Integer.parseInt(String.valueOf(result));

	}

}