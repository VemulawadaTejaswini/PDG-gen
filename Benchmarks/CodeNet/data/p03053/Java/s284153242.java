import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		String[][] mas = new String[a][b];
		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < b; j++) {
				mas[i][j] = s.substring(j, j + 1);
			}
		}
		Stream<String> st = Arrays.stream(mas).flatMap(s -> Arrays.stream(s));
		while (st.collect(Collectors.toList()).contains(".")) {
			count++;
			String[][] ms;
			ms = new String[mas.length][];
			for (int i = 0; i < ms.length; i++) {
				ms[i] = new String[mas[i].length];
				System.arraycopy(mas[i], 0, ms[i], 0, mas[i].length);
			}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (mas[i][j].equals(".")) {
						mas[i][j] = check(ms, i, j);
					}
				}
			}
			st = Arrays.stream(mas).flatMap(s -> Arrays.stream(s));
		}
		System.out.println(count);
		sc.close();
	}

	private static String check(String[][] mas, int i, int j) {
		if (i >= 1) {
			if (mas[i - 1][j].equals("#")) {
				return "#";
			}
		}
		if (j >= 1) {
			if (mas[i][j - 1].equals("#")) {
				return "#";
			}
		}
		if (i < mas.length - 1) {
			if (mas[i + 1][j].equals("#")) {
				return "#";
			}
		}
		if (j < mas[1].length - 1) {
			if (mas[i][j + 1].equals("#")) {
				return "#";
			}
		}
		return ".";
	}

}
