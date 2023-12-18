import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n - 1; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < 10; k++) {
					if ((i >> k & 1) != (j >> k & 1)) {
						sb.append(k + 1).append(' ');
						break;
					}
				}
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
