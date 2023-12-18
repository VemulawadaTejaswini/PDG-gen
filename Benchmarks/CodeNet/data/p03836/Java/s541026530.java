import java.util.Scanner;

public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sx = in.nextInt();
		int sy = in.nextInt();
		int tx = in.nextInt();
		int ty = in.nextInt();
		int dx = tx - sx;
		int dy = ty - sy;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dx; i++) {
			sb.append('R');
		}
		for (int i = 0; i < dy; i++) {
			sb.append('U');
		}
		for (int i = 0; i < dx; i++) {
			sb.append('L');
		}
		for (int i = 0; i < dy; i++) {
			sb.append('D');
		}
		sb.append('D');
		for (int i = 0; i <= dx; i++) {
			sb.append('R');
		}
		for (int i = 0; i <= dy; i++) {
			sb.append('U');
		}
		sb.append('L');
		sb.append('U');
		for (int i = 0; i <= dx; i++) {
			sb.append('L');
		}
		for (int i = 0; i <= dy; i++) {
			sb.append('D');
		}
		sb.append('R');
		System.out.println(sb.toString());
		in.close();
	}
}