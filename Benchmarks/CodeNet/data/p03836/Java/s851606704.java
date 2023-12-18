import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = sx; i < tx; i++) {
			sb.append('R');
		}
		for (int i = sy; i < ty; i++) {
			sb.append('U');
		}

		for (int i = sx; i < tx; i++) {
			sb.append('L');
		}
		for (int i = sy; i < ty; i++) {
			sb.append('D');
		}

		sb.append('D');
		for (int i = sx; i < tx + 1; i++) {
			sb.append('R');
		}
		for (int i = sy; i < ty + 1; i++) {
			sb.append('U');
		}
		sb.append('L');

		sb.append('U');
		for (int i = sx; i < tx + 1; i++) {
			sb.append('L');
		}
		for (int i = sy; i < ty + 1; i++) {
			sb.append('D');
		}
		sb.append('R');

		System.out.println(sb.toString());
	}
}
