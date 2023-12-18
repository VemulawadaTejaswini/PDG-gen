import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next();
			long result = 0;
			// ビット全探索
			int digits = n.length() - 1;
			for (int i = 0; i < Math.pow(2, digits); i++) {
				StringBuffer tmp = new StringBuffer().append(n.charAt(0) - '0');
				for (int j = 0; j < digits; j++) {
					if ((1 & i >> j) == 1) {
						result += Long.valueOf(tmp.toString());
						tmp = new StringBuffer("0");
					}
					tmp.append(n.charAt(j + 1));
				}
				result += Long.valueOf(tmp.toString());
			}
			System.out.println(result);
		}
	}

}
