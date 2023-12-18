import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		// forth
		for (int ny = sy; ny < ty; ny++) {
			sb.append("U");
		}
		for (int nx = sx; nx < tx; nx++) {
			sb.append("R");
		}

		// back
		for (int ny = ty; ny > sy; ny--) {
			sb.append("D");
		}
		for (int nx = tx; nx > sx; nx--) {
			sb.append("L");
		}

		// forth again
		sb.append("L");
		for (int ny = sy; ny < ty + 1; ny++) {
			sb.append("U");
		}
		for (int nx = sx - 1; nx < tx; nx++) {
			sb.append("R");
		}
		sb.append("D");

		// back again
		sb.append("R");
		for (int ny = ty; ny > sy - 1; ny--) {
			sb.append("D");
		}
		for (int nx = tx + 1; nx > sx; nx--) {
			sb.append("L");
		}
		sb.append("U");
		
		System.out.println(sb);
	}

}
