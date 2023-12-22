import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			String str = sc.next() + "X";
			for (int i = 0; i < N; ++i) {
				String next = "";
				char c = str.charAt(0);
				int n = 1;
				for (int j = 1; j < str.length(); ++j) {
					if (c != str.charAt(j)) {
						next += n + "" + c;
						c = str.charAt(j);
						n = 1;
					} else {
						++n;
					}
				}
				str = next + "X";
			}
			System.out.println(str.substring(0, str.length() - 1));
		}
	}
}