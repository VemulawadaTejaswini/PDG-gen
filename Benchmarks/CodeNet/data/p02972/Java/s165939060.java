import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int[] b = new int[M + 1];
		for (int i = 1; i < M; i++) {
			b[i] = Integer.parseInt(in.next());
		}
		//		boolean isOk = true;
		for (int i = M / 2; i > 0; i--) {
			int sum = 0;
			for (int j = 2; j * i <= M; j++) {
				if (b[j * i] == 1) {
					sum++;
				}
			}
			if (sum % 2 != 0) {
				if (b[i] == 0) {
					b[i] = 1;
				}
			} else {
				if (b[i] == 1) {
					b[i] = 1;
				}
			}
		}
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < b.length; i++) {
			if (b[i] == 1) {
				count++;
				sb.append(b[i]);
				if (i != b.length - 1) {
					sb.append(" ");
				}
			}
		}
		if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') {
			sb.deleteCharAt(sb.length() - 1);
		}
		System.out.println(count);
		if (count != 0) {
			System.out.println(sb.toString());
		}
		in.close();
	}
}