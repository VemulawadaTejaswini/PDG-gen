import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String st = sc.nextLine();
	static char[] str = st.toCharArray();
	public static void main(String[] args) {

		String order = null;
		int q = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < q; i++) {
			order = sc.nextLine();

			String[] od = order.split(" ");

			switch(od[0]) {
				case("replace"):
					replace(od);
				continue;
				case("reverse"):
					reverse(od);
				continue;
				case("print"):
					print(od);
				continue;
				default:
				continue;
			}
		}


	}
	private static void print(String[] od) {
		int n = Integer.parseInt(od[1]);
		int m = Integer.parseInt(od[2]);

		for (int i = n; i <= m; i++) {
			System.out.print(str[i]);
		}
		System.out.println();

	}
	private static void reverse(String[] od) {
		int n = Integer.parseInt(od[1]);
		int m = Integer.parseInt(od[2]);
		char[] st_tmp = new char[m - n + 1];
		int j = 0;

		for (int i = n; i <= m; i++) {
			st_tmp[j] = str[i];
			j++;
		}

		j--;
		for (int i = n; i <= m; i++) {
			str[i] = st_tmp[j];
			j--;
		}

	}
	private static void replace(String[] od) {
		int n = Integer.parseInt(od[1]);
		int m = Integer.parseInt(od[2]);
		char[] st_rep = od[3].toCharArray();
		int j = 0;

		for (int i = n; i <= m; i++) {
			str[i] = st_rep[j];
			j++;
		}

	}

}

